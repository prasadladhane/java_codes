import java.util.*;

class StackDemo{
	public static void main(String[]args){

		Stack<Integer> stack=new Stack<>();

		//stack.add(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		//stack.push("Prasad");
		
		stack.pop();
		stack.pop();
		//stack.pop(20);
		stack.peek();

		System.out.println(stack.empty());
		System.out.println(stack.search(10));
		System.out.println(stack.search(40));
		System.out.println(stack.search(50));

		System.out.println(stack);

		System.out.println(stack.capacity());
		System.out.println(stack.size());
	}
}
