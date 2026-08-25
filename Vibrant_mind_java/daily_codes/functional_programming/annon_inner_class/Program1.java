
@FunctionalInterface
interface Addable{

	void f1(int x,int y);

}
class Client{
	public static void main(String[]args){
		Addable add1=new Addable(){
			@Override
			public void f1(int a, int b){
				System.out.println(a+b);
			}
		};
		add1.f1(10,20);
	}
}
