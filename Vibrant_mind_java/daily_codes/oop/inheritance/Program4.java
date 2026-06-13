class Parent1{
	int x=20;
	Parent1(){
		System.out.println("In Parent 1");
	}
}
class Child extends Parent1{
	int x=30;

	void getData(){
		System.out.println(super.x);
	}
}

class Demo{
	public static void main(String[]args){
		Child obj= new Child();
		obj.getData();
	}
}
