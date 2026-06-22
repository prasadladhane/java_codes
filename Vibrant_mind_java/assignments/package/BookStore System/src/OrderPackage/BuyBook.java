package OrderPackage;

import BookPackage.Book;

	class Order {
	private int orderID;
	private int custID;
	private String custName;
	private int quantity;
	private int Ammount;

	Order(int orderID,int custID,String custName ,int quantity,int Ammount){
		
		this.orderID =orderID;
		this.custID =custID;
		this.custName= custName;
		this.quantity = quantity;
		this.Ammount = Ammount;

	}

	public void displayOrder(){
	System.out.printf("%-15s : %d%n", "Order ID", orderID);
System.out.printf("%-15s : %d%n", "Customer ID", custID);
System.out.printf("%-15s : %s%n", "Customer Name", custName);
System.out.printf("%-15s : %d%n", "Quantity", quantity);
System.out.printf("%-15s : %d%n", "Amount", Ammount);
	}

}


public class BuyBook {
	public static void main(String[] args) {

	Order order  = new Order(11,321,"Amol",50,50000);
	order.displayOrder();
	System.out.println("----------------------------------");
	Book book = new Book(22,"The Hindu","Narendra Modu",200,10);
	book.displayBookInfo();
	
	}
}