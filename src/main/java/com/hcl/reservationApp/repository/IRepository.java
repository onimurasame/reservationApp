/**
 * 
 */
package com.hcl.reservationApp.repository;

import java.util.List;

/**
 * @author rastudillo
 *
 */
public interface IRepository<T> {

	/**
	 * Gets all the elements of T
	 * @return
	 */
	public List<T> getAll();

	/**
	 * Gets all elements specified by arguments
	 * @return
	 */
	public Class<T> getByArguments(Class<T> argumentClass);

}
