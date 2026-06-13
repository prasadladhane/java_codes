import java.util.Scanner;

class Demo7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=sc.nextInt();

		int maxNum=0;
		int secondMax=0;

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(maxNum<=arr[i]){
				maxNum=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]>secondMax && arr[i]<maxNum){
				secondMax=arr[i];
			}
		}
		System.out.println("Maximum Element:"+maxNum);
		System.out.println("Second Maximum Element:"+secondMax);
	}
}
