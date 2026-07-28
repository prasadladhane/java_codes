import java.util.*;

class VectorMethodsDemo{
	public static void main(String[]args){
		Vector vector1=new Vector();
		Vector vector2=new Vector();
		vector1.add(10);
		vector1.add(20);
		vector1.add("Prasad");
		vector1.add(89.9);
		vector1.add(89.9);
		vector1.add(true);
		vector1.add(null);

		vector1.addElement(70);
		
		System.out.println(vector1.firstElement());
		System.out.println(vector1.lastElement());

		vector1.insertElementAt(7,0);

		System.out.println(vector1.capacity());
		System.out.println("Default capacity:"+vector2.capacity());

		System.out.println(vector1);
	}
}
	
