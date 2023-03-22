package com.boot.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.ticket.model.Ticket;
import com.boot.ticket.service.TicketServiceImpl;

@RestController
@RequestMapping("/Booking")
public class TiketController {
   
	@Autowired
	TicketServiceImpl ticketServiceImpl;
	
	@GetMapping("/AllBooked")
	public List<Ticket> getAllTickets() {
		List<Ticket> list= new ArrayList<>();
	List<Ticket> tickets = ticketServiceImpl.getAllTickets();
	return tickets;
	}
	 @GetMapping("{id}")
	public Ticket GetTicketsById(@PathVariable  String id){
	Ticket ticket1=	ticketServiceImpl.GetTicketsById(id);
	return ticket1;
	}
	  @PostMapping("/BookNew")
	 public Ticket BookNewTicket(@RequestBody Ticket ticket) {
	Ticket ticket2=	 ticketServiceImpl.BookNewTicket(ticket);
		return ticket2;
	  }
		
	  @DeleteMapping("/DeleteBooking/{id}")
		public void DeleteBookingById(@PathVariable String id){
		ticketServiceImpl.DeleteBookingById(id);
		System.out.println("booking is deleted successfully");
			 }
	  @PutMapping("/updateDetails")
	  public void UpdateBooking(@RequestBody Ticket ticket) {
		  ticketServiceImpl.UpdateBooking(ticket);
		  System.out.println("After booking details can be updated only once");
		  System.out.println("Booking details ate updated");
	  }
}
