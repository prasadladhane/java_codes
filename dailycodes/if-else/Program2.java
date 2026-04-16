class Demo2{
	public static void main(String[]args){
		char ch='A';

		if(ch>=97 && ch<=128){
			System.out.println("Lowercase");
		}else if(ch>=65 && ch<=96){
			System.out.println("Uppercase");
		}else{
			System.out.println("Neither Lower Nor Upper");
		}
	}
}
