import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.Iterator;

class Example{
	public static void main(String[]args){

		List<String> friends=new ArrayList<>();
		friends.add("Kareena");
		friends.add("Raveena");
		friends.add("Rihana");
		friends.add("Katreena");

		System.out.println(friends);

		List<String> list=Arrays.asList("Kareena","Raveena","Rihana","Katreena");
		System.out.println(list);

		System.out.println("-------------------------");

		//for loop
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		System.out.println("--------------------------");

		//for-each loop
		
		for(String actress:list){
			System.out.println(actress);
		}

		System.out.println("--------------------------");

		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("---------------------------");

		//default forEach(Consumer<T>)
		//A method which has a parameter but parameter is Functional Interface type
		//such method called as HigherOrder Function


		//using Anonymous Inner Class
		Consumer<String> printName=new Consumer<String>(){
			public void accept(String s){
				System.out.println(s);
			}
		};

		list.forEach(printName);

		Consumer<String> consume=(name)-> System.out.println(name.toUpperCase());

		list.forEach(consume);

		System.out.println("------------------------------");

		//list.forEach((String n)->System.out.println(n));
		list.forEach((n)->System.out.println(n));

		System.out.println("-------------------------------");
		list.forEach(n->System.out.println(n));
		
		System.out.println("-------------------------------");
		//n->System.out.println(n) = System.out.println

		list.forEach(System.out::println);
	}
}
