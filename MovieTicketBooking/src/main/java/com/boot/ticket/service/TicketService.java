package com.boot.ticket.service;

import java.util.List;

import com.boot.ticket.model.Ticket;

public interface TicketService {
  
	//for getting all tickets details
	 public List<Ticket>getAllTickets();
	 
	 //get ticket by specific id
	 public Ticket GetTicketsById(String id);
	 
	 //Book new tickts
	 public Ticket BookNewTicket(Ticket ticket);
	 
	 //Delete booking
	 public void DeleteBookingById(String id);
	 
	 //update booking details
	 public void UpdateBooking(Ticket ticket);
}
