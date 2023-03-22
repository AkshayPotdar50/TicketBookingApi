package com.boot.ticket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.ticket.model.Ticket;
import com.boot.ticket.repository.TicketRepository;
@Service
public class TicketServiceImpl implements TicketService {
 
	@Autowired
	TicketRepository ticketRepository;
	@Override
	public List<Ticket> getAllTickets() {
		List<Ticket> list =new ArrayList<>();
		ticketRepository.findAll().forEach(Ticket ->list.add(Ticket));
		return list;
	}

	@Override
	public Ticket GetTicketsById(String id) {
	Ticket ticket=	ticketRepository.findById(id).get();  //here we have to use get method because findbyid is itreative method
		return ticket;
	}

	@Override
	public Ticket BookNewTicket(Ticket ticket) {
	Ticket bookedTicket=	ticketRepository.save(ticket);
		return bookedTicket;
	}

	@Override
	public void DeleteBookingById(String id) {
		ticketRepository.deleteById(id);
		}

	@Override
	public void UpdateBooking(Ticket ticket) {
		ticketRepository.save(ticket);
		
	}

}
