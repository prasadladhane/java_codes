import java.util.Scanner;

class Demo6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=sc.nextInt();

		int maxNum=0;

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(maxNum<=arr[i]){
				maxNum=arr[i];
			}
		}
		System.out.print("Maximum Element:"+maxNum);
	}
}
