/**
 * 
 */
package com.hcl.reservationApp.service;

import java.util.List;

import com.hcl.reservationApp.bean.Reservation;

/**
 * @author onimu
 *
 */
public interface IReservationService {
	
	/**
	 * Finds all the reservations
	 * 
	 * @return list of reservations
	 */
	public List<Reservation> findAllReservations();
	
	/**
	 * Creates new reservation
	 * 
	 * @param reservation to be persisted
	 * @return reservation persisted
	 */
	public Reservation saveReservation(Reservation reservation);
	
	/**
	 * Creates a batch of reservations
	 * 
	 * @param reservations to be persisted
	 * @return reservations persisted
	 */
	public List<Reservation> saveReservations(List<Reservation> reservations);
}
