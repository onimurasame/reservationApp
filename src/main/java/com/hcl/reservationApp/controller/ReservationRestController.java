package com.hcl.reservationApp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.dummy.ReservationDummy;
import com.hcl.reservationApp.service.IReservationService;


/**
 * @author rastudillo
 *
 */
@RestController
public class ReservationRestController {
	private Logger log = Logger.getLogger(ReservationRestController.class);
	
	@Autowired
	IReservationService service;
	
	@RequestMapping(value = "/initDB", method = RequestMethod.GET)
	public String initDB() {
		
		log.info("Initializing database...");
		
		createReservationsFromDummy(service);
		
		return "Database Initialized";
		
	}
	
	@Transactional
	private void createReservationsFromDummy(IReservationService service) {
		ReservationDummy rd = new ReservationDummy();
		List<Reservation> reservations = rd.getReservationListDummy();
		
		for(Reservation reservation: reservations) {
			service.saveReservation(reservation);
		}
	}

	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public List<Reservation> getReservations() {

		log.info("Getting reservations...");
		
		return service.findAllReservations();
	}
}
