package com.boot.ticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
private String ticketId;
private String price;
private String Quantity;
public Ticket(String ticketId, String price, String quantity) {
	super();
	this.ticketId = ticketId;
	this.price = price;
	Quantity = quantity;
}
public String getTicketId() {
	return ticketId;
}
public void setTicketId(String ticketId) {
	this.ticketId = ticketId;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getQuantity() {
	return Quantity;
}
public void setQuantity(String quantity) {
	Quantity = quantity;
}
@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", price=" + price + ", Quantity=" + Quantity + "]";
}


	
}
