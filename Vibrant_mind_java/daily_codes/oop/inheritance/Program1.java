class Parent{
	void marry(){
		System.out.println("Katrina");
	}
	void career(){
		System.out.println("Engineer");
	}
}
class Child extends Parent{

	void getData(){
		marry();
		career();
	}

}
class Main{

	public static void main(String[]args){
		Child obj=new Child();
		obj.getData();
	}
}
