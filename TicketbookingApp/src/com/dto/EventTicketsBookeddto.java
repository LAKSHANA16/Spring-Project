package com.dto;

public class EventTicketsBookeddto {
private String eventName;
private double totalTicketsBooked;
public EventTicketsBookeddto() {}
public EventTicketsBookeddto(String eventName, double totalTicketsBooked) {
	super();
	this.eventName = eventName;
	this.totalTicketsBooked = totalTicketsBooked;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public double getTotalTicketsBooked() {
	return totalTicketsBooked;
}
public void setTotalTicketsBooked(double totalTicketsBooked) {
	this.totalTicketsBooked = totalTicketsBooked;
}
@Override
public String toString() {
	return "EventTicketsBookeddto [eventName=" + eventName + ", totalTicketsBooked=" + totalTicketsBooked + "]";
}


}
