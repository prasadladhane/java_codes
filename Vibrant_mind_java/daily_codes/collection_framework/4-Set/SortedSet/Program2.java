import java.util.*;

class NullDataCheck{
	public static void main(String[]args){
		SortedSet ss=new TreeSet();

		ss.add(30);
		ss.add(40);
		ss.add(10);
		ss.add(20);
		ss.add(50);
		ss.add(null);


		System.out.println(ss);

	}
}
