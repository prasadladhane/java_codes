//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

import java.util.concurrent.*;

class FixedThreadPoolExample{
	public static void main(String[]args){

		ExecutorService executor=Executors.newFixedThreadPool(3);

		for(int i=1;i<=8;i++){
			int requestId=i;
			executor.submit(()->{
				System.out.println(Thread.currentThread().getName()+"Processing request"+requestId);
				try{
					Thread.sleep(3000);
				}catch(InterruptedException ie){
				}
				System.out.println(Thread.currentThread().getName()+"Completed Request"+requestId);
			});
		}
		executor.shutdown();
	}
}
