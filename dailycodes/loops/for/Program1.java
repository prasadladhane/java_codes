class Demo1{
	public static void main(String[]args){
		int num=1;
		char ch='A';

		for(int i=1;i<=9;i++){
			if(i%2==0){
				System.out.print(num+" ");
			}else{
				System.out.print(ch+" ");
			}
			ch++;
			num++;
		}
	}
}
