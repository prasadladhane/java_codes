class UploadTask extends Thread{
	UploadTask(ThreadGroup tg, String name){
		super(tg,name);
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(getName()+"uploading photo"+i);
		}try{
			Thread.sleep(1000);
		}
		catch(Exception e){

		}
	}
}
class Main{
	public static void main(String[]args){
		ThreadGroup uploadGroup=new ThreadGroup("Upload Group");

		UploadTask t1=new UploadTask(uploadGroup,"Upload-1");	
		UploadTask t2=new UploadTask(uploadGroup,"Upload-2");	
		UploadTask t3=new UploadTask(uploadGroup,"Upload-3");
		t1.start();
		t2.start();
		t3.start();
	}
}

