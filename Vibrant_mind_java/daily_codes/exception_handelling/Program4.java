class Demo4{
	public static void main(String[]args){
		int arr[]=new int[5];
		try{
		for(int i=0;i<=10;i++){
			arr[i]=arr[i]+10;
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
