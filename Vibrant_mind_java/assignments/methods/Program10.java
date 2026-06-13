import java.util.Scanner;

class Demo10{
	static int count=0;
	static int countNumber(int num){
		while(num>0){
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number:");
		int num=sc.nextInt();

		System.out.println("Count is:"+countNumber(num));
	}
}
