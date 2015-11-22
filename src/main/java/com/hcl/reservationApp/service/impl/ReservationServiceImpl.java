package com.hcl.reservationApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.repository.IReservationRepository;
import com.hcl.reservationApp.service.IReservationService;

/**
 * @author rastudillo
 *
 */

@Service
public class ReservationServiceImpl implements IReservationService {
	
	@Autowired(required = true)
	IReservationRepository repository;


	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.service.IReservationService#findAllReservations()
	 */
	@Override
	public List<Reservation> findAllReservations() {
		return (List<Reservation>) repository.findAll();
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		return repository.save(reservation);
	}

	@Override
	public List<Reservation> saveReservations(List<Reservation> reservations) {
		return (List<Reservation>) repository.save(reservations);
	}
}
