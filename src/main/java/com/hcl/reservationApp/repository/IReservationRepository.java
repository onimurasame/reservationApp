/**
 * 
 */
package com.hcl.reservationApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.reservationApp.bean.Reservation;

/**
 * @author rastudillo
 *
 */
@Repository
public interface IReservationRepository extends CrudRepository<Reservation, Long> {
	
}
