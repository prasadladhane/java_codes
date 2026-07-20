class Node{
	
	public int value;

	public Node next;
}
class Client{
	public static void main(String[]args){
		Node ll1=new Node();

		Node ll2=new Node();

		ll1.value=10;
		ll1.next=ll2;

		ll2.value=20;
		ll2.next=null;
		
		System.out.println(ll1);
		System.out.println(ll2);
	}
}
