import java.util.*;

class Demo6{

	static int sum=0;

	static int sumNatural(int n){
		for(int i=1;i<=n;i++){
			sum += i;
		}
		return sum;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n;

		System.out.println("Enter N:");
		n=sc.nextInt();

		System.out.println(sumNatural(n));
	}
}

