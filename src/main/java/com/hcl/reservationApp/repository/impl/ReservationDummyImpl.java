/**
 * 
 */
package com.hcl.reservationApp.repository.impl;

import java.util.List;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.dummy.ReservationDummy;
import com.hcl.reservationApp.repository.IRepository;

/**
 * @author rastudillo
 *
 */
public class ReservationDummyImpl implements IRepository<Reservation> {


	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.repository.IRepository#getAll()
	 */
	@Override
	public List<Reservation> getAll() {
		ReservationDummy rd = new ReservationDummy();
		return rd.getReservationListDummy();
	}

	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.repository.IRepository#getByArguments()
	 */
	@Override
	public Class<Reservation> getByArguments(Class<Reservation> reservation) {
		return null;
	}

}
