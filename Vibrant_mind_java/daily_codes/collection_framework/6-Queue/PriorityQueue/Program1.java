import java.util.PriorityQueue;

class PriorityQueue1{
	public static void main(String[]args){
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();

		pq.add(40);
		pq.offer(10);
		pq.add(30);
		pq.offer(20);

		System.out.println(pq);

		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

	}
}

