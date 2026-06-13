abstract class Parent{
	abstract void marry();
	void career(){
		System.out.println("Engineer");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("Katrina");
	}
}

class Demo2{
	public static void main(String[]args){
		//Child obj=new Child();
		Parent obj=new Parent();
		obj.marry();
		obj.career();
	}
}
