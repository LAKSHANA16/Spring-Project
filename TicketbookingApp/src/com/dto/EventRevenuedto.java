package com.dto;

public class EventRevenuedto {
private String eventName;
private double totalRevenue;
public EventRevenuedto() {}
public EventRevenuedto(String eventName, double totalRevenue) {
	this.eventName = eventName;
	this.totalRevenue = totalRevenue;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public double getTotalRevenue() {
	return totalRevenue;
}
public void setTotalRevenue(double totalRevenue) {
	this.totalRevenue = totalRevenue;
}
@Override
public String toString() {
	return "EventRevenuedto [eventName=" + eventName + ", totalRevenue=" + totalRevenue + "]";
}

}
