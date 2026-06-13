class Demo{
	public static int divide(int a, int b){

		try{
			return a / b;
		}catch(ArithmeticException e){
			System.out.println("Error:"+e.getMessage());
			return -1;
		}
	}
}
class Client{
	public static void main(String[]args){
		int x=Demo.divide(10,0);
	}
}

