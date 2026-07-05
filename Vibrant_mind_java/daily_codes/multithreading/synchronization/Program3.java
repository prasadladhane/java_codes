class ChatgptServer{
	int requests=0;
	String requestType="Image Generation";
	
	public void processRequests(){

		synchronized(this){
			requests++;
		}
	}
}
class Client{
	public static void main(String[]args)throws InterruptedException{
		ChatgptServer chatgptServer=new ChatgptServer();
		Runnable task=()->{

			for(int i=0;i<10000;i++){
				chatgptServer.processRequests();
			}
		};

		Thread t1=new Thread(task);
		Thread t2=new Thread(task);

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(chatgptServer.requests);
		System.out.println(chatgptServer.requestType);
	}
}

