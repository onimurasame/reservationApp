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
}
