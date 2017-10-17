package example6;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		names.push("민경훈");
		names.push("환희");
		names.push("브라이언");
		names.push("최정원");
		names.push("김정훈");
		names.push("이지훈");
		
		System.out.println("스택에 저장된 요소의 갯수 : " + names.size());
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println("스택에 저장된 요소의 갯수 : " + names.size());
	}
}
