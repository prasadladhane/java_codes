class Parent1{
	Parent1(){
		System.out.println("In Parent 1");
	}
	Parent1(int x){
		System.out.println("In Parent 1");
	}
}
class Demo{
	public static void main(String[]args){
		Parent1 obj= new Parent1();
	}
}
