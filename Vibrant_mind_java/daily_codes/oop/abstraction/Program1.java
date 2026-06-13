class Parent{
	void marry();
	void career(){
		System.out.println("Engineer");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("Katrina");
	}
}

class Demo1{
	public static void main(String[]args){
		Child obj=new Child();
	}
}
