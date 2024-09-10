package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Venue;
import com.service.VenueService;

public class VenueController {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("***********VENUE OPS*************");
			System.out.println("Enter 1 for venue details");
			System.out.println("Enter 2 for single details");
			System.out.println("Enter 0 to exit");
			System.out.println("*********************************");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting.....Thank you!!!");
				break;
			} // if ends
			VenueService venueService=new  VenueService();
			switch (input) {
			case 1:
				System.out.println("ALL VENUE DETAILS");
				try {
				
					List<Venue> list=venueService.getAllVenues();
					for(Venue v:list)
					{
						System.out.println(v);
					}
				}
				catch(SQLException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("SINGLE VENUE DETAILS");
				System.out.println("Enter id");
				int id=sc.nextInt();
				try
				{
					Venue venue=venueService.getVenueById(id);
					System.out.println(venue);
				}
				catch(SQLException e)
				{
					System.out.println(e.getMessage());
				}
				catch(NullPointerException e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
			default :
				System.out.println("Invalid Input");
			}
		}
	}
}
