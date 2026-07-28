/* Inner Classes
 * Class inside class is called inner class. 
 * Inner class is logical way of grouping classes together.
 * for ex. 
 * 	class Employee{
 * 		Address address;
 *
 * 	}
 * 	class Address{
 *
 * 	}
 *	OR
 *
 *	class Employee{
 *		class Address{
 *
 *		}
 *	}
 *
 *
 *
 * Inner class is the one of the way to achieve Encapsuation.
 *
 *					Nested Class
 *						|
 *						|
 *						|--- Non static nested class
 *						|
 *						|--- Static nested class
 *						|
 *
 */

class Outer{
	int outerFields=11;

	void outerMethod(){
		System.out.println("In Outer Method");
		System.out.println(outerFields);
	}

	class Inner{
		int innerFields=22;

		void innerMethod(){
			System.out.println("Inside Inner Method");
			System.out.println(innerFields);
		}
	}
}

class Client{
	public static void main(String[]args){

		Outer out=new Outer();
		//System.out.println(out.outerFields);
		out.outerMethod();

		Inner in=new Inner();
		//System.out.println(in.innerFields);
		in.innerMethod();

	}
}

