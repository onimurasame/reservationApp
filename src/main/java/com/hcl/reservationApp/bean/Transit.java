/**
 * 
 */
package com.hcl.reservationApp.bean;

import java.util.Date;

/**
 * @author onimu
 *
 */
public class Transit {

	private Integer id;
	private String name;
	private Boolean isTransfer;
	private Date start;
	private Date end;
	private Integer slots;

	public Transit() {

	}

	/**
	 * @param id
	 * @param name
	 * @param isTransfer
	 * @param start
	 * @param end
	 */
	public Transit(Integer id, String name, Boolean isTransfer, Date start, Date end) {
		this.id = id;
		this.name = name;
		this.isTransfer = isTransfer;
		this.start = start;
		this.end = end;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isTransfer
	 */
	public Boolean getIsTransfer() {
		return isTransfer;
	}

	/**
	 * @param isTransfer
	 *            the isTransfer to set
	 */
	public void setIsTransfer(Boolean isTransfer) {
		this.isTransfer = isTransfer;
	}

	/**
	 * @return the start
	 */
	public String getStart() {
		return start.toString();
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end.toString();
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * @return the slots
	 */
	public Integer getSlots() {
		long MINUTE_MILLIS = 1000 * 60;

		if (start == null || end == null)
			return 0;

		slots = (int) ((end.getTime() / MINUTE_MILLIS) - (start.getTime() / MINUTE_MILLIS)) / 10;
		return slots;
	}

}
