///Program to add 15 in each element of array

class Demo1{
	public static void main(String[]args){
		
		int arr[]=new int[]{10,20,30,40,50,60};
		
		for(int i=0;i<arr.length;i++){
			arr[i]+=15;

			System.out.println(arr[i]);

		}
	}
}
