class ThreadName extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
	}
}
class Client{
	public static void main(String[]args){
		ThreadName tn=new ThreadName();
		tn.start();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		//System.out.println(getName());
	}
}

