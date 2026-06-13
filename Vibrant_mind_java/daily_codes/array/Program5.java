class Demo5{
	public static void main(String[]args){
		int arr[]=new int[]{-2,5,-6,7,-3,8};

		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr[i]=arr[i]*arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
