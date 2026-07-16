import java.util.*;

class ForEachDemo2{
	public static void main(String[]args){
		int count=0;

		ArrayList<String> al=new ArrayList<String>();

		al.add("Prasad");
		al.add("Ladhane");
		al.add("Abhishek");
		al.add("Harshal");
		System.out.println(al);

		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		for(String x:al){
			//if(x==str){        == tells whether both have same object or not, that is same address 
			if(x.equals(str)){   // equals compares the content in both
				count++;
			}
		}
		System.out.println(str + "is repeated"+count+"times");
	}
}
