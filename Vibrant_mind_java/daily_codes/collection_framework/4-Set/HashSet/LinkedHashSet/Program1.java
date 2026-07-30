import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[]args){
		LinkedHashSet<Integer> empId=new LinkedHashSet<>();

		empId.add(105);
		empId.add(101);
		empId.add(103);
		empId.add(102);

		System.out.println(empId);
		System.out.println("-------------------------------");
		empId.add(107);
		empId.add(101);
		System.out.println(empId);
	}
}
