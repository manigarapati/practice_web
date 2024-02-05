package collections;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		//s.push('a');
		s.push('w');
		s.push(23);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search(1));
		System.out.println(s.peek());
		System.out.println(s.peek());
	}

}
