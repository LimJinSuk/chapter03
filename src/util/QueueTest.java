package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		//큐는 믈래스가 없고 링크드 리스트가 구현함.
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우너");
		queue.offer("또치");
		
		System.out.println(queue.isEmpty());
		//큐의 앞에서 끄집어냄
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());//꺼내지 않고 출력만
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.isEmpty());
		//비어있을 경우 null리턴 
		//스택은 배열이라 안되고 큐는 링크드리스트라서 되는듯
		System.out.println(queue.poll());
	}

}
