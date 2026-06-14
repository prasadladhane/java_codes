import java.io.*;

class Demo7{
	public static void readFile(String path){
		FileReader fr= null;

		try{
			fr=new FileReader(path);

		}catch(FileNotFoundException e){

			System.out.println("File not Found!");

		}finally{
			if(fr!=null){
				fr.close();
			}
		}
	}
}
class Client{
	public static void main(String[]args){
		Demo7.readFile("java/VibrantMind_Java/daily_codes/");
	}

}
