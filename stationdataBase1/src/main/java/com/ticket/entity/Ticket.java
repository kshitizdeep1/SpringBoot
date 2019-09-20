package com.ticket.entity;

//@Author- Abhimanyu(57531),Ritika(57532),Akshay(57564),Juzer(57536)

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // We are using this annotation to map our class with the database!!
		// By Default It will Create Table name Same As Class Name!!
public class Ticket {

	@Id // We are using this annotation to make "ticket_no"as a primary key!!
	@GeneratedValue(strategy = GenerationType.AUTO) // For generating the "ticket_no" automatically!!
	private long ticketNo;

	@Column(nullable = false) // Here we are using this annotation that particular column value should not be
								// null!!
	private String source;

	@Column(nullable = false)
	private String destination;

	private float fare;

	/* private Train train; */

	@Column(nullable = false)
	private Date date_of_journey;

	@Column(nullable = false)
	private String classes;

	private long pnr;

	// Here We Are Generating The Default Constructor!!
	public Ticket() {
		super();
	}

	// Here We Are Generating the Setter And Getter for the Fields That We Created
	// Above!!
	public long getPnr() {
		return pnr;
	}

	public void setPnr(long pnr) {
		this.pnr = pnr;
	}

	public long getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public Date getDate_of_journey() {
		return date_of_journey;
	}

	public void setDate_of_journey(Date date_of_journey) {
		this.date_of_journey = date_of_journey;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}
	/*
	 * public Train getTrain() { return train; } public void setTrain(Train train) {
	 * this.train = train; }
	 */

}
