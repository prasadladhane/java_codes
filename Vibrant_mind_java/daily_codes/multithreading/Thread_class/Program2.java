class ThreadDemo2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());

		for(int i=1;i<=5;i++){
			System.out.println("In Run");
		}
	}
	public static void main(String[]args)throws InterruptedException{
		System.out.println("In main");

		System.out.println(Thread.currentThread().getName());

		ThreadDemo2 t1=new ThreadDemo2(); //Created a Thread with Thread Class
		t1.start();		//gave call to thread, it will call run method

		for(int i=1;i<=500;i++){
			System.out.println("Before Sleep");
		}

		
		//Thread.sleep(2000);

		for(int i=1;i<=500;i++){
			System.out.println("After Sleep");
		}
	}
}

