package chapter03;

public class Student extends Person {
	public Student() {
		// 자식 생성자에서 부모 생성자를 명시적으로 호출하지 않으면 
		// 자동으로 부모의 기본 생성자를 호출하게 된다.
		// super();//자동으로 해줘서 주석 처리
		System.out.println("Student() called");
	}
}
