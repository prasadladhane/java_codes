import java.util.*;

class NaviagableSetMethods{
	public static void main(String[]args){

		NavigableSet<Integer> ns=new TreeSet<>();

		ns.add(20);
		ns.add(30);
		ns.add(10);
		ns.add(40);
		ns.add(50);
		
		System.out.println(ns);

		System.out.println(ns.lower(40)); //returns greatest element but strictly smaller than provided for ex. smaller than 40, but greatest
		System.out.println(ns.floor(40)); //returns less than or equal element to provided
		System.out.println(ns.ceiling(40));// returns grater or equal
		System.out.println(ns.higher(40)); // returns strictly greater

		ns.pollFirst(); //removes lowest element(first element)
		ns.pollLast(); // removes highest element(last element)
		System.out.println(ns);
		System.out.println(ns.descendingSet());// returns reverse order set
	}
}
