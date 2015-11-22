package com.hcl.reservationApp.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author rastudillo
 *
 */
@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private	Integer price;
	private String startingPoint;
	private String endingPoint;
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="idReservation")
	private List<Transit> itinerary;
	
	/**
	 * 
	 */
	public Reservation() {
	}

	/**
	 * @param id
	 * @param price
	 * @param startingPoint
	 * @param endingPoint
	 * @param itinerary
	 */
	public Reservation(Long id, Integer price, String startingPoint, String endingPoint, List<Transit> itinerary) {
		this.id = id;
		this.price = price;
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
		this.itinerary = itinerary;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%d, price='%s', startingPoint='%s', endingPoint='%s']",
                id, price, startingPoint, endingPoint);
    }
	
}
