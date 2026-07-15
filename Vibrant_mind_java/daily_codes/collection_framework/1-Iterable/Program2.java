import java.util.*;
class ForEachDemo2{
	public static void main(String[]args){
		
		ArrayList al=new ArrayList();

		//ArrayList <Integer> al=new ArrayList <Integer> ();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);

		for(Integer x:al){
	//	for(Object x:al){
			System.out.println(x);
		}
	}
}

