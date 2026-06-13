class Animal{
	void sound(){
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{

	Dog(){
		super.sound();
	}


	@Override
	void sound(){
		System.out.println("Barking");
	}
	void getData(){
		sound();
	}
}

class Demo{
	public static void main(String[]args){
		System.out.println("Inside main");
		Dog obj=new Dog();
		obj.getData();
	}
}

