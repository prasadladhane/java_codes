import java.util.*;

class NaviagableSetDemo{
	public static void main(String[]args){
		NavigableSet<Integer> ns=new TreeSet<>();
		//NavigableSet ns=new TreeSet();

		ns.add(20);
		ns.add(30);
		ns.add(10);
		ns.add(40);
		ns.add(50);

		//ns.add("Prasad");
		
		System.out.println(ns);
	}
}
