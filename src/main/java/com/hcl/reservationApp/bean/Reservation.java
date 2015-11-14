package com.hcl.reservationApp.bean;

import java.util.List;

/**
 * @author rastudillo
 *
 */
public class Reservation {
	
	private Integer id;
	private	Integer price;
	private String startingPoint;
	private String endingPoint;
	private List<Transit> itinerary;
	
	/**
	 * @param id
	 * @param price
	 * @param startingPoint
	 * @param endingPoint
	 * @param itinerary
	 */
	public Reservation(Integer id, Integer price, String startingPoint, String endingPoint, List<Transit> itinerary) {
		this.id = id;
		this.price = price;
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
		this.itinerary = itinerary;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return the startingPoint
	 */
	public String getStartingPoint() {
		return startingPoint;
	}

	/**
	 * @param startingPoint the startingPoint to set
	 */
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	/**
	 * @return the endingPoint
	 */
	public String getEndingPoint() {
		return endingPoint;
	}

	/**
	 * @param endingPoint the endingPoint to set
	 */
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}

	/**
	 * @return the itinerary
	 */
	public List<Transit> getItinerary() {
		return itinerary;
	}

	/**
	 * @param itinerary the itinerary to set
	 */
	public void setItinerary(List<Transit> itinerary) {
		this.itinerary = itinerary;
	}
	
}
