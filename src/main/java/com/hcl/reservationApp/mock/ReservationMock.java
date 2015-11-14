/**
 * 
 */
package com.hcl.reservationApp.mock;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

import com.hcl.reservationApp.bean.Reservation;

/**
 * @author rastudillo
 *
 */
public class ReservationMock {

	public List<Reservation> getReservationMock() {
		
		List<Reservation> reservations = new ArrayList<>();
	
		for(int i = 0; i < 10; i++) {
			Reservation reservation = Mockito.mock(Reservation.class, Mockito.RETURNS_DEEP_STUBS);
			
			reservations.add(reservation);
		}
		
		return reservations;
	}
}
