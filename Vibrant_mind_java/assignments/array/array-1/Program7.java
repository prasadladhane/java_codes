import java.util.*;

class Demo7{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");

		int maxNum=0;
		int secondMax=0;

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(maxNum<arr[i]){
				maxNum=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]<maxNum && arr[i]>secondMax){
				secondMax=arr[i];
			}
		}
		System.out.println("Second Maximum Element:"+secondMax);

	}
}


