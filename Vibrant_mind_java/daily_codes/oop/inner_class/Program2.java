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

		Outer.Inner in1=new Outer().new Inner();
		in1.innerMethod();

	}
}

