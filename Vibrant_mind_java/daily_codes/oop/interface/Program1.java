interface A{
	default void fun(){
		System.out.println("A");
	}
}
interface B{
	default void fun(){
		System.out.println("B");
	}
}
class C implements A,B{

	@Override
	public void fun(){
		System.out.println("C");
	}

	public static void main(String[]args){

		C obj=new C();
		obj.fun();
	}
}


