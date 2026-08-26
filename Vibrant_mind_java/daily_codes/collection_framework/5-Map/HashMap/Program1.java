import java.util.Map;
import java.util.HashMap;

class MapDemo{

	public static void main(String[]args){

		Map<Integer,String> emp=new HashMap<>();

		emp.put(200,"Prachi");
		emp.put(99,"Shiva");
		emp.put(101,"Prasad");
		emp.put(102,"Abhishek");
		emp.put(103,"Harshal");
		emp.put(105,"Aniket");
		emp.put(104,"Prasad");

		System.out.print("Map:"+" "+emp);
	}
}
