package prob5;

import java.util.EmptyStackException;

public class MainApp {

	public static void main(String[] args) {
//		try {
			MyStack stack = new MyStack(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java"); //배열늘리기
			stack.push(".");
//			stack.print();
			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
//		} catch ( EmptyStackException ex) {
//			System.out.println( ex );
//		}
	

	}

}

