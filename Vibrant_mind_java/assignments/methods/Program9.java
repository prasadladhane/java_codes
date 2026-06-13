import java.util.Scanner;

class Demo9{

	static int table=1;

	static void tableNum(int num){
		for(int i=1;i<=10;i++){
			table=num*i;
			System.out.println(table);
		}
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int num;

		System.out.print("Enter Number:");
		num=sc.nextInt();

		tableNum(num);
	}
}

