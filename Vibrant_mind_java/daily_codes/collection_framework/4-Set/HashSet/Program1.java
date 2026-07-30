import java.util.*;

class HashSetDemo{
	public static void main(String[]args){

		HashSet<Integer> set=new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(15);
		set.add(25);
		set.add(9);
		set.add(11);

		System.out.println("HashSet :"+set);
		

		set.add(11);
		set.add(27);

		System.out.println("HashSet :"+set);
	}
}
