class Parent1{
	void fun(){}
}
class Parent2{
	void run(){}
}
class Child extends Parent1,Parent2{
	void king(){}
}
class Main{
	public static void main(String[]args){
		Child obj=new Child();
		obj.fun();
		obj.run();
		obj.king();
	}
}
