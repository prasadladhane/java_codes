class MyThread implements Runnable{
	public void run(){
		while(true){
			System.out.println("Background Task");
		}
	}
}

class Demo{
	public static void main(String[]args){
		MyThread mt=new MyThread();

		Thread thread=new Thread(mt);
		thread.setDaemon(true);
		thread.start();
		System.out.println("Main Ends");
	}
}
