class Demo6{
	public static void riskyMethod(String s, int[]arr){

		try{
			int num=Integer.parseInt(s);
			System.out.println(arr[num]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Bad Index!");
		}catch(NumberFormatException e){
			System.out.println("Not a Number!");
		}catch(Exception e){
			System.out.println("Unknown Error!"+e.getMessage());
		}
	}
}
class Client{
	public static void main(String[]args){
		int num=5;
		Demo6.riskyMethod("Prasad",new int[num]);
	}
}

