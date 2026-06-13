class Demo2{
	Demo2(int x){
		this("Prasad");		
		System.out.println("Parameterised Constructor");
	}
	Demo2(){
		this(50);
		System.out.println("Inside Default Constructor");
	}
	Demo2(String name){
		System.out.println(name);
	}
	public static void main(String[]args){
		Demo2 obj=new Demo2();
	}
}
