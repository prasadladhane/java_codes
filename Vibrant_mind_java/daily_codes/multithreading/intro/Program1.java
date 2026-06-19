class Demo{
	Demo(){
		System.out.println("In Demo Constructor");
	}
	public void finalize(){
		System.out.println("Object Deleted");
	}
}
class Client{
	static void fun(){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
	}

	public static void main(String[]args)throws InterruptedException{
		System.out.println("Start main");
		Thread.sleep(5000);
		System.out.println("End main");

	}
}
