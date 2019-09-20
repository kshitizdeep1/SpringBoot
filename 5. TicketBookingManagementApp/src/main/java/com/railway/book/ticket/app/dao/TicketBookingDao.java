package com.railway.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.railway.book.ticket.app.entities.Ticket;
@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
