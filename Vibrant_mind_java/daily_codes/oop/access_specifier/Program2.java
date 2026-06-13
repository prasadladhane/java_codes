class Demo2{
	private int x=10;
	int y=20;

	private void fun(){
		System.out.println("Inside private fun");
	}
	void run(){
		System.out.println("Inside Run");
	}
}

class Demo3{
	public static void main(String[]args){
		Demo2 obj=new Demo2();
		System.out.println(obj.x);
		System.out.println(obj.y);

		obj.fun();
		obj.run();
	}
}



