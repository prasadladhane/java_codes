import java.util.Scanner;

class Demo8{
	static int sum=0;

	static int oddSum(int n){
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n;
		
		System.out.print("Enter N:");
		n=sc.nextInt();

		System.out.println(oddSum(n));
	}
}
