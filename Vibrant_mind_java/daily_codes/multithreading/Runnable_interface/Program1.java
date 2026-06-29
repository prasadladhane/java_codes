class MyTask implements Runnable{
	@Override
	public void run(){
		System.out.println("Task Executing");
	}
}
class Demo{
	public static void main(String[]args){
		MyTask mt=new MyTask();
		Thread t=new Thread(mt);
		t.start();
	}
}
