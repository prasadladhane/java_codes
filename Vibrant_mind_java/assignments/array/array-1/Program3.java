import java.util.*;

class Demo3{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		arr[0]=arr[size-1];
		arr[size-1]=temp;

		for(int i=0;i<size;i++){
			System.out.println("Final Swap Array: "+arr[i]);
		}

	}
}


