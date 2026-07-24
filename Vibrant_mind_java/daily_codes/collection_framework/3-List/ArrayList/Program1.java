import java.util.*;

class ArrayListMethod{
	public static void main(String[]args){
		ArrayList<String> fruits = new ArrayList<>();

		//add();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");

		System.out.println(fruits);

		//get()
		System.out.println(fruits.get(2)); //Mango

		//set()
		fruits.set(0, "Grapes");
		System.out.println(fruits);

		//size()
		System.out.println(fruits);

		//contains()
		System.out.println(fruits.contains("Orange"));

		//indexOf()
		System.out.println(fruits.indexOf("Orange"));

		//remove(index)
		fruits.remove(1);
		System.out.println(fruits);

		//removeChange(3,7)
		//System.out.println(fruits.removeRange(2,4));

	}
}
		


