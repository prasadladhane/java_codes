import java.io.*;
class FileNotFoundDemo2{
	public static void main(String[]args)throws IOException{
		File f=new File("abc.txt");

		FileReader fr=new FileReader(f);
	}
}
