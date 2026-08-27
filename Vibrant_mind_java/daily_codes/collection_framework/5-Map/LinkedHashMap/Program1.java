import java.util.*;

class LinkedHashMapDemo{
	public static void main(String[]args){
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();

		map.put(101,"Java");
		map.put(102,"Spring");
		map.put(103,"Hibernate");
		map.put(104,"JDBC");

		System.out.println("Original Map: "+map);
		System.out.println("Value of Key 102:"+map.get(102));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
