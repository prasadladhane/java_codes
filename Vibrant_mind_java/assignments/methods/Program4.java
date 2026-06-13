class Demo4{
	static void evenNum(int num){
		while(num<=100){
			if(num%2==0){
				System.out.println(num);
			}
			num++;
		}
	}

	public static void main(String[]args){

		int num=1;
		evenNum(num);
	}
}
		
