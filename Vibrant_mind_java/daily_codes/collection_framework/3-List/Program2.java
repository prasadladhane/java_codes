import java.util.*;
class ListMethods{
	public static void main(String[]args){
		List al=new ArrayList();

		//add()
		al.add(10);
		al.add(20);
		al.add("Prasad");
		al.add("Abhi");
		al.add("Harshal");
		al.add(6.5);
		System.out.println(al);

		//add(int index,E element)
		al.add(3,"Rahul");
		al.add(5,"Aniket");
		System.out.println(al);

		//contains(Onject o)
		System.out.println(al.contains(10));
		System.out.println(al.contains(70));

		//get(int index)
		System.out.println(al.get(5));

		//isEmpty()
		System.out.println(al.isEmpty());

		//remove(int index))
		System.out.println(al.remove(5));
		System.out.println();

	}
}

