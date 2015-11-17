/**
 * 
 */
package com.hcl.reservationApp.repository.impl;

import java.util.List;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.repository.IRepository;

/**
 * @author rastudillo
 *
 */
public class ReservationRespositoryImpl implements IRepository<Reservation> {


	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.repository.IRepository#getAll()
	 */
	@Override
	public List<Reservation> getAll() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.repository.IRepository#getByArguments(java.lang.Class)
	 */
	@Override
	public Class<Reservation> getByArguments(Class<Reservation> reservation) {
		// TODO Auto-generated method stub
		return null;
	}

}
