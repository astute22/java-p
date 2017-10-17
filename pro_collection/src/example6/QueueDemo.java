package example6;

import java.util.LinkedList;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<>();
		queue.offer("버즈");
		queue.offer("HOT");
		queue.offer("젝스키스");
		queue.offer("SG워너비");
		queue.offer("SS501");
		
		System.out.println("Queue에 저장된 요소의 갯수 : " + queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("Queue에 저장된 요소의 갯수 : " + queue.size());
		
	}

}
