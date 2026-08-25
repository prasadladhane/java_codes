
@FunctionalInterface

interface Welcome{
	void greet();
}
class Client{
	public static void main(String[]args){
		Welcome msg1 = () -> System.out.println("Hello Java");

		Welcome msg2 = () -> {
			System.out.println("Hello C");
			System.out.println("Hello Python");
		};
		msg1.greet();
		msg2.greet();
	}
}

