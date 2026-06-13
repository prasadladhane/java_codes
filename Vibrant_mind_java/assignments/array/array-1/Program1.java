import java.util.Scanner;

class Demo1{
	Scanner sc=new Scanner(System.in);

	void forBackArray(int size){
		int arr[]=new int[size];
		System.out.println("Enter Array elements:");

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println("forward array: "+arr[i]);
		}
		for(int i=size-1;i>=0;i--){
			System.out.println("backward array: "+arr[i]);
		}
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Array Size:");
		int size=sc.nextInt();

		Demo1 obj=new Demo1();
		obj.forBackArray(size);
	}
}
