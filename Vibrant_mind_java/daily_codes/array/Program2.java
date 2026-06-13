import java.util.*;

class Demo2{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[] {1,5,9,8,7,5,6};

		System.out.print("Enter Number:");
		int num=sc.nextInt();

		int count=0;
		int temp=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				count++;
				if(count==1){
					temp=i;
				}
			}
		}
		if(count!=0){
			System.out.println("Number found at index:"+temp);
		}else{
			System.out.println("Element not found");
		}
				
			
	}
}

