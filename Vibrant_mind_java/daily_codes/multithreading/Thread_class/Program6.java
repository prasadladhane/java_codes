class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In ThreadDemo");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In MyThread");
		}
	}
}
class Client{
	public static void main(String[]args){
		ThreadDemo t1=new ThreadDemo();
		MyThread m1=new MyThread();

		t1.start();
		m1.start();
	}
}

