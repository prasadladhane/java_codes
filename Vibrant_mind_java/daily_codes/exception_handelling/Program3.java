import java.io.*;

class Demo3{
	public static void main(String[]args){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String name="";

		try{
			name=br.readLine();
		}
		catch(IOException e){
			 
		}
		System.out.println(name);
	}
}
