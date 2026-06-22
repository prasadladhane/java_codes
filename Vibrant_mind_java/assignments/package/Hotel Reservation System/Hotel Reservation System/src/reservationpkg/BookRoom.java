package reservationpkg;
import  roompkg.Room;

import java.util.Scanner;

class Reservation {
	int reservationID;
	int customerID; 
	String customerName;
    int bookdays;

    Reservation(int reservationID,int customerID){
    	this.reservationID=reservationID;
    	this.customerID=customerID;
    }


    
    public void reservatioInfo(){
    	System.out.printf("%-15s :  %d%n","ReservationID",reservationID);
		System.out.printf("%-15s :  %d%n","CustomerID",customerID);
		System.out.printf("%-15s :  %s%n","customerName",customerName);
		System.out.printf("%-15s :  %d%n","Bookdays",bookdays);
    	
    }

    public void bookRoom(String customerName,int bookdays){
    		this.customerName = customerName;
    		this.bookdays =bookdays;

    		System.out.println("Room Book Sucessfully.......");


    }

}

class BookRoom{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Reservation R1 = new Reservation(111,3546);
		System.out.println("=============Welcome To StayWell==============");
		
		System.out.println("Please Provide The Details.....");

		System.out.println("-----------------------------------------");
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Book Room For How Many Days?? :");
		int bookdays = sc.nextInt();
		System.out.println("Select Room Type[Single , Double]");
		String roomtype = sc.next();
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

		R1.bookRoom(name,bookdays);

		System.out.println("-----------------------------------------");

		Room room = new Room(35,1500,10,roomtype,bookdays);

		System.out.println("Reservation Details");
		R1.reservatioInfo();
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("Booking Details");
		room.BookingDetails();
		System.out.println("-----------------------------------------");
		System.out.println("Total Payable Ammount:"+room.calcRoomBill());
		System.out.println("-----------------------------------------");


		
	}
}