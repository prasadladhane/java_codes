class MyThread extends Thread{
	public void run(){
		System.out.println("In Run");
		//.join();
		System.out.println("End run");
	}
}
class Client{
	public static void main(String[]args)throws InterruptedException{
		System.out.println("In Main");
		MyThread mt=new MyThread();
		mt.start();
		//Thread.sleep(2000);
		//mt.join();
		mt.yield();
		System.out.println("End Main");
		
	}
}
