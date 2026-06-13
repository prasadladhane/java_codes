class Parent extends Object{
	Parent(){
		super();
		System.out.println("In Parent Constructor");
	}

	void marry(){
		System.out.println("Katrina");
	}

	void career(){
		System.out.println("Engineer");
	}
}

class Child extends Parent{

	Child(){
		super();
		System.out.println("In Child Constructor");
	}

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
