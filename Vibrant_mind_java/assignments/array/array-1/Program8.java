import java.util.*;

class Demo8{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");

		int arr[]=new int[size];
		int sum=10;
		int num1=0;
		int num2=0;
		int temp;

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			num1=sum-arr[i];
			temp=arr[i];
			for(int j=i+1;j<size;j++){
				if(num1 == arr[j]){	
					System.out.println("Pair is:"+arr[i]+","+arr[j]);
				}
			}
		}
		
	}
}


