package com.mylib;
public class Booking 
{
	//private String DepartureDate;
	private int bookingID;
	private int NoOfTickets;
	private int price;
	private String cabinType;
	private String Destination;

   public Booking(int bookingID,int NoOfTickets,int price,String cabinType,String Destination)
    {
    	this.bookingID=bookingID;
    	this.NoOfTickets = NoOfTickets;
    	this.price = price;
    	this.cabinType = cabinType;
    	this.Destination = Destination;
	}

	public int totalPrice(){
		return NoOfTickets*price;
	}

	public void ticketConfirmation(){
		System.out.println("----------------Ticket Details----------------");
		System.out.printf("%-15s : %s%n", "BookingID", bookingID);
		System.out.printf("%-15s : %s%n", "NoOfTickets", NoOfTickets);
		System.out.printf("%-15s : %s%n", "price", price);
		System.out.printf("%-15s : %s%n", "cabinType", cabinType);
		System.out.printf("%-15s : %s%n", "Destination", Destination);
		System.out.println("----------------------------------------------");

	}

}