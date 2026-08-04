import java.util.*;

class TreeSetMethodsDemo{
	public static void main(String[]args){

		TreeSet<Integer> ts=new TreeSet<>();

		ts.add(105);
		ts.add(101);
		ts.add(110);
		ts.add(102);
		ts.add(105);

		System.out.println(ts);

		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		System.out.println("Higher:"+ts.higher(102));
		System.out.println("Lower:"+ts.lower(105));
		System.out.println("Ceiling:"+ts.ceiling(103));
		System.out.println("Floor:"+ts.floor(103));

	}
}
