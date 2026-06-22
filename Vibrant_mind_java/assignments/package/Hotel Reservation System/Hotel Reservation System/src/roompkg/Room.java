package roompkg;

public class Room{
	private int roomNumber;
	private int rate;
	private int Discount;
	private int bookdays;
	private String roomType;

	public Room(int roomNumber,int rate,int Discount, String roomType,int bookdays){
		this.roomNumber=roomNumber;
		this.rate=rate;
		this.Discount=Discount;
		this.roomType=roomType;
		this.bookdays = bookdays;
	}

	public double calcRoomBill(){
		int bill = rate*bookdays;
		return bill-bill*Discount/100;
	}

	public void BookingDetails(){
		System.out.printf("%-15s :  %d%n","Room Number",roomNumber);
		System.out.printf("%-15s :  %d%s%n","Rate Per Night",rate,"(INR)");
		System.out.printf("%-15s :  %d%s%n","Discount",Discount,"%");
		System.out.printf("%-15s :  %s%n","roomType",roomType);
	}


}