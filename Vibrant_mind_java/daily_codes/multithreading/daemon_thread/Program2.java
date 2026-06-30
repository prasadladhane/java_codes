class Demo2{
	Demo2(){
		System.out.println("In Constructor");
	}
	public void finalize(){
		System.out.println("In Finalize");
	}
	void fun(){
		System.out.println("In Fun");
	}
}
class Client{
	public static void main(String[]args)throws InterruptedException{
		System.out.println("main started");
		Demo2 obj=new Demo2();
		obj.fun();
		obj=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End main");
	}
}
