package BookPackage;
public class Book{
	private int bookID;
	private String title;
	private String author;
    private int price;
    private int discount;

   public  Book(int bookID,String title,String author ,int price,int discount){
		this.bookID =bookID;
		this.title =title;
		this.author= author;
		this.price = price;
		this.discount = discount;
	} 
    public void displayBookInfo(){
System.out.printf("%-15s : %d%n", "Book ID", bookID);
System.out.printf("%-15s : %s%n", "Title", title);
System.out.printf("%-15s : %s%n", "Author", author);
System.out.printf("%-15s : %d%n", "Price", price);
System.out.printf("%-15s : %d%n", "Discount", discount);
	}
}
