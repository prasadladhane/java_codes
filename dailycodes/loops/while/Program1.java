class Demo1{
	public static void main(String[]args){
		int i=0;
		int val=5;
		int sum=0;

		while(i<4){
			sum=sum+val;
			val=val-1;

			System.out.print(i+" "+val+" "+sum+" ");
			i=i+1;
		}
		System.out.println();
	}
}

