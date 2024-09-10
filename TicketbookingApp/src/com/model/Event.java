package com.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.enums.EventType;

public class Event {
private int eventId;
private String eventName;
private LocalDate eventDate;
private LocalTime eventTime;
private int totalSeats;
private int availableSeats;
private double ticketPrice;
private EventType eventType;
private int venueId;
public Event() {}
public Event(int eventId, String eventName, LocalDate eventDate, LocalTime eventTime, int totalSeats,
		int availableSeats, double ticketPrice, EventType eventType, int venueId) {
	super();
	this.eventId = eventId;
	this.eventName = eventName;
	this.eventDate = eventDate;
	this.eventTime = eventTime;
	this.totalSeats = totalSeats;
	this.availableSeats = availableSeats;
	this.ticketPrice = ticketPrice;
	this.eventType = eventType;
	this.venueId = venueId;
}
public Event(String eventName, LocalDate eventDate, LocalTime eventTime, int totalSeats, int availableSeats,
		double ticketPrice, EventType eventType, int venueId) {
	super();
	this.eventName = eventName;
	this.eventDate = eventDate;
	this.eventTime = eventTime;
	this.totalSeats = totalSeats;
	this.availableSeats = availableSeats;
	this.ticketPrice = ticketPrice;
	this.eventType = eventType;
	this.venueId = venueId;
}
public int getEventId() {
	return eventId;
}
public void setEventId(int eventId) {
	this.eventId = eventId;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public LocalDate getEventDate() {
	return eventDate;
}
public void setEventDate(LocalDate eventDate) {
	this.eventDate = eventDate;
}
public LocalTime getEventTime() {
	return eventTime;
}
public void setEventTime(LocalTime eventTime) {
	this.eventTime = eventTime;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}
public double getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
}
public EventType getEventType() {
	return eventType;
}
public void setEventType(EventType eventType) {
	this.eventType = eventType;
}
public int getVenueId() {
	return venueId;
}
public void setVenueId(int venueId) {
	this.venueId = venueId;
}
@Override
public String toString() {
	return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate + ", eventTime="
			+ eventTime + ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats + ", ticketPrice="
			+ ticketPrice + ", eventType=" + eventType + ", venueId=" + venueId + "]";
}

}
