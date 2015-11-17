package com.hcl.reservationApp.service.impl;

import java.util.List;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.repository.IRepository;
import com.hcl.reservationApp.repository.impl.ReservationDummyImpl;
import com.hcl.reservationApp.repository.impl.ReservationRespositoryImpl;
import com.hcl.reservationApp.service.IReservationService;

/**
 * @author rastudillo
 *
 */
public class ReservationServiceImpl implements IReservationService {
	
	private static final Boolean USE_DUMMY = true;

	/* (non-Javadoc)
	 * @see com.hcl.reservationApp.service.IReservationService#findAllReservations()
	 */
	@Override
	public List<Reservation> findAllReservations() {
		IRepository<Reservation> repository = USE_DUMMY ? new ReservationRespositoryImpl() : new ReservationDummyImpl();
		
		return repository.getAll();
	}

}
