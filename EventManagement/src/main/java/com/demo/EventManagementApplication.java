package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.repos.Event;
import com.demo.service.EventService;

@SpringBootApplication
public class EventManagementApplication implements CommandLineRunner{

	@Autowired
	private EventService eventService;
	
	public static void main(String[] args) {
		SpringApplication.run(EventManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=fmt.parse("14/03/2021");
		Date d2=fmt.parse("04/05/2021");
		Date d3=fmt.parse("11/12/2021");
		
		Event e1=new Event("Dancing", "Bhimavaram", d1, 12, 25);
		Event e2=new Event("Artist", "Rajahmundry", d2, 18, 15);
		Event e3=new Event("Singing", "Chennai", d3, 16, 24);
		
		eventService.addEvent(e1);
		eventService.addEvent(e2);
		eventService.addEvent(e3);
		
	}

}
