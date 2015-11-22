/**
 * 
 */
package com.hcl.reservationApp.dummy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.hcl.reservationApp.bean.Reservation;
import com.hcl.reservationApp.bean.Transit;

/**
 * @author onimu
 *
 */
public class ReservationDummy {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyyhhmm");
	private static final String DATE = "11132015";

	public List<Reservation> getReservationListDummy() {
		List<Reservation> reservationList = new ArrayList<Reservation>();

		try {
			Transit location1A = new Transit(null, "JetBlue", false, sdf.parse(DATE + "0700"), sdf.parse(DATE + "0900"));
			List<Transit> itinerary1 = new ArrayList<>();
			itinerary1.add(location1A);
			Reservation reservation1 = new Reservation(null, 300, "LGA", "FLL", itinerary1);
			
			Transit location2A = new Transit(null, "United", false, sdf.parse(DATE + "0700"), sdf.parse(DATE + "0720"));
			Transit location2B = new Transit(null, "IAD", true, sdf.parse(DATE + "0720"), sdf.parse(DATE + "0840"));
			Transit location2C = new Transit(null, "United", false, sdf.parse(DATE + "0840"), sdf.parse(DATE + "1110"));
			List<Transit> itinerary2 = new ArrayList<>();
			itinerary2.add(location2A);
			itinerary2.add(location2B);
			itinerary2.add(location2C);
			Reservation reservation2 = new Reservation(null, 300, "JFK", "MIA", itinerary2);
			
			
			reservationList.add(reservation1);
			reservationList.add(reservation2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reservationList;
	}

}
