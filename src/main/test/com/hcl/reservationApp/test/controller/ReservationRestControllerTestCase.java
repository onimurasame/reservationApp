package com.hcl.reservationApp.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.hcl.reservationApp.ReservationApp;
import com.hcl.reservationApp.bean.Reservation;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReservationApp.class)
@WebIntegrationTest("server.port:8080")
public class ReservationRestControllerTestCase {

	RestTemplate restTemplate = new TestRestTemplate();
	
	@Test
	public void testGetReservations() {
		List<Reservation> list = new ArrayList<>();
		
		@SuppressWarnings("unchecked")
		ResponseEntity<List<Reservation>> responseEntity = (ResponseEntity<List<Reservation>>) restTemplate.getForEntity("http://localhost:8080/reservations", list.getClass());
		
		Assert.notNull(responseEntity.getBody(), "Reservation list is null");
		Assert.notEmpty(responseEntity.getBody(), "Reservation list is empty");
	}
	
	public void testGetReservation() {
		//restTemplate.
	}

}
