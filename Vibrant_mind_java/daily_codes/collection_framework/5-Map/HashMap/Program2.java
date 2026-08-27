import java.util.Map;
import java.util.HashMap;

class HashMapMethods{
	public static void main(String[]args){

		Map<Integer, String> emp=new HashMap<>();

		emp.put(1,"Prasad");
		emp.put(2,"Abhishek");
		emp.put(3,"Aniket");
		emp.put(4,"Harshal");
		emp.put(5,"Saurabh");
		emp.put(6,"Nayan");
		emp.put(7,"Sumit");

		System.out.print("Employee Names:"+" "+emp);
		System.out.println();
		System.out.println("Employee 2:"+emp.get(2));
		System.out.println("is employee 3 present:"+emp.containsKey(3));
		System.out.println("is employee Naman Present?:"+emp.containsValue("Naman"));
		System.out.println("No of employees:"+emp.size());
	//	System.out.println("Replace Emp 8 with Suresh:"+emp.replace(8,"Suresh")); // null value at 8th key
		System.out.println(emp);
		System.out.println("Add employee at 9th position: "+emp.putIfAbsent(9,"Nagesh"));
		System.out.println(emp);
		System.out.println("-----------------------------------------------");
		System.out.println(emp.get(8));
		System.out.println("Is Null present?: "+emp.containsValue(null));


	}
}
