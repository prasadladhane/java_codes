import java.util.*;

class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[] {2,5,2,7,8,9,2};

		System.out.print("Enter Number:");
		int num=sc.nextInt();

		int count=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				count++;
			}else{

			}
		}
		if(count!=0){
			System.out.println("The number "+num +"occured "+count +"times");
		}else{
			System.out.println("number not found");
		}
	}
}
