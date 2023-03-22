package com.boot.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.ticket.model.Ticket;
@Repository
public interface TicketRepository extends CrudRepository<Ticket, String> {

}
