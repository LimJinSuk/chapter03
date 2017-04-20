package util;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		stack.push("둘리");
		
		System.out.println(stack.isEmpty());//비어있는지 확인
		System.out.println(stack.pop());//String return하며 맨위 둘리 나옴
		System.out.println(stack.pop());//도우넛 나옴
		
		System.out.println(stack.peek());//맨위 확인(마이콜)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//스택이 비어 있는 경우  pop호출 시 예외 발생
		//System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());
	}

}
