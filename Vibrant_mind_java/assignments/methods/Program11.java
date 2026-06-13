import java.util.Scanner;

class Demo11{
	static int firstNum;
	static int lastNum;
	static int count=0;
	static void firstLastNum(int num){
		while(num>0){
			int rem=num%10;
			count++;
			if(count==1){
				lastNum=rem;
			}
			
			firstNum=rem;
			num/=10;
		}
		System.out.println("firstNum:"+firstNum);
		System.out.println("lastNum:"+lastNum);
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number:");
		int num=sc.nextInt();

		firstLastNum(num);
	}
}
