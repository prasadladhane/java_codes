import java.util.LinkedHashMap;

class LinkedHashMapDemo{
	public static void main(String[]args){

		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();

		map.put(101,"Java");
		map.put(102,"Spring");
		map.put(103,"Hibernate");
		map.put(104,"JDBC");

		System.out.println("Original Map: "+map);
		System.out.println("Value of Key 102:"+map.get(102));
		System.out.println("Key 105:"+map.getOrDefault(105,"Notfound"));
		map.replace(101,"Java","Python");
		System.out.println(map);
	}
}
