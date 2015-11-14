package com.hcl.reservationApp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.service.ReservationService;

/**
 * @author rastudillo
 *
 */
@RestController
public class ReservationRestController {
	private Logger log = Logger.getLogger(ReservationRestController.class);

	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public List<Reservation> getReservations() {
		ReservationService service = new ReservationService();
		
		log.info("Getting reservations...");
		return service.findAllReservations();
	}
}
