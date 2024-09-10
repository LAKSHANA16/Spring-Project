package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.EventRevenuedto;
import com.dto.EventTicketsBookeddto;
import com.service.EventService;

public class EventController {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EventService eventService=new EventService();
		while (true) {
			System.out.println("***************EVENT OPS***************");
			System.out.println("ENTER 1 TO CALCULATE TOTAL REVENUE");
			System.out.println("ENTER 2 FOR BOOKED TICKETS");
			System.out.println("Enter 0 for exit");
			System.out.println("******************************");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting....");
				break;
			}
			switch (input) {
			case 1:
				System.out.println("TOTAL REVENUE");
				try {
					List<EventRevenuedto>list=eventService.getRevenueByEvent();
					for(EventRevenuedto dto:list)
					{
						System.out.println(dto.getEventName()+"\t"+(dto.getTotalRevenue()/10000000)+"Cr");
					}
					System.out.println("--------------------------------------------");
					System.out.println("GROSS REVENUE"+eventService.getGrossTotalRevenue(list)/10000000+"Cr\n");
				}
				catch(SQLException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("TOTAL TICKETS BOOKED");
				try 
				{
					List<EventTicketsBookeddto> list = eventService.getTotalTicketsBookedByEvent();
					for(EventTicketsBookeddto bdto:list)
					{
						System.out.println(bdto.getEventName()+"\t"+(bdto.getTotalTicketsBooked()));
					}
				}
				catch(SQLException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				break;
				default:
					System.out.println("INVALID INPUT");
			}
		}
	}
}
