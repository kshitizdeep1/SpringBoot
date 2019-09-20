package com.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.dao.TicketDao;
import com.ticket.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketDao ticketDao;
	
	
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}


	public Ticket getTicketById(Long ticketId) {		
		return ticketDao.findOne(ticketId);				
	}


	public Iterable<Ticket> getAllBookedTickets() {
		return ticketDao.findAll();
	}


	public void deleteTicket(Long ticketId) {
		ticketDao.delete(ticketId);		
	}


	
}
