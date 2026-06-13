import java.util.Scanner;

class Demo1{

	static void naturalNum(int n){
		int num=1;
		while(num<=n){
			System.out.println(num);
			num++;
		}
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int n=sc.nextInt();
		Demo1.naturalNum(n);
	}
}
