import java.util.*;
class Demo1{
	void add(int x, int y){
		System.out.println(x+y);
	}

	void add(double x,double y){
		System.out.println(x+y);
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Demo obj=new Demo();

		System.out.print("Enter First Number:");
		double x=sc.nextDouble();

		System.out.print("Enter Second Number:");
		double y=sc.nextDouble();

		obj.add(x,y);
	}
}
