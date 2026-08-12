import java.util.*;

class App{

	public static Set<String> getShopList( List<Set<String>> shopList,int customerNo){

		return shopList.get(customerNo - 1);

	}

	public static void main(String[]args){

		List<Set<String>> shopList=new ArrayList<>();

		Set<String> customer1 = new HashSet<String>();
	
		customer1.add("Laptop");
		customer1.add("Phone");
		customer1.add("Tablet");

					
		Set<String> customer2 = new HashSet<String>();

		customer2.add("Camera");
		customer2.add("Laptop");
		customer2.add("Headphones");

		Set<String> customer3 = new HashSet<String>();

		customer3.add("Phone");
		customer3.add("Camera");
		customer3.add("Shoes");

		shopList.add(customer1);
		shopList.add(customer2);
		shopList.add(customer3);

		/*
		for(int i=0;i< shopList.size();i++){
			


		}
		*/

		int i=1;
		for(Set<String> customer:shopList){
			System.out.println("Customer "+i++);

			for(String items:customer){
				System.out.println(items);
			}
		}

	}
}

