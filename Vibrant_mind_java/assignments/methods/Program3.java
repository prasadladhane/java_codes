//import java.util.*;

class Demo3{
	static void alphabetPrint(char ch){
		while(ch<='z'){
			System.out.println(ch);
			ch++;
		}
	}

	public static void main(String[]args){
		//Scanner sc=new Scanner(System.in);
		char ch='a';
		alphabetPrint(ch);
	}
}
