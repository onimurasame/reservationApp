package com.hcl.reservationApp.service;

import java.util.List;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.dummy.ReservationDummy;

public class ReservationService {

	public List<Reservation> findAllReservations() {
		return new ReservationDummy().getReservationListDummy();
	}

}
