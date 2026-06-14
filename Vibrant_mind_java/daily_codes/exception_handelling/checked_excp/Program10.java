import java.io.*;
class FileNotFoundDemo{
	public static void main(String[]args){
		File f=new File("abc.txt");

		FileReader fr=new FileReader(f);
	}
}
