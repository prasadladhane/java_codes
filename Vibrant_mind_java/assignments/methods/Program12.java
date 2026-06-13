import java.util.*;

class Demo12{
	
	static int firstNum,lastNum,count,sum,rem;

	static int sumOfFirstLastNum(int num){
		while(num>0){
			count++;
			rem=num%10;
			if(count==1){
				lastNum=rem;
			}
			firstNum=rem;
			num/=10;
		}
		return firstNum+lastNum;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number:");
		int num=sc.nextInt();

		System.out.println("Sum of First and Last Number is:"+sumOfFirstLastNum(num));

	}
}
