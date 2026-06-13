class Demo5{
	static void oddNum(int num){
		while(num<=100){
			if(num%2==1){
				System.out.println(num);
			}
			num++;
		}
	}

	public static void main(String[]args){
		int num=1;
		oddNum(num);
	}
}
