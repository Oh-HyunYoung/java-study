package com.douzone.paint.collection.test;


import java.util.ArrayList;
import java.util.List;

import com.douzon.paint.i.Drawable;
import com.douzon.paint.point.Point;
import com.douzon.paint.shape.Rect;
import com.douzon.paint.shape.Shape;
import com.douzone.paint.collection.Mystack;


public class GenericTest {
	public static void main(String[] args) {
		drawShape(new Rect());
		//drawShape(new Point());
		
		Mystack<? extends Shape> s1 = null;
		Mystack<? super Shape> s2 = null;
		
		List<Rect> list1 = new ArrayList<>();
		List<Shape> list2 = new ArrayList<>();
		
		Mystack<Drawable> s = new Mystack<>(20);
		
		drawShapeLayer(list1,null);
		drawShapeLayer(list2,s);
	}
	
	/**
	 * Generic Parameter 제한01: extends
	 * 1) hierachy max
	 * 2) 자식들만(자신포함)
	 */
	
	public static <T extends Shape> void drawShape(T t) {
		t.draw();
	}
	
	/**
	 * Generic Parameter 제한02: super
	 * 1) hierachy min
	 * 2) 부모들만(자신포함)
	 * 3) <T super Type> 오류!!
	 * 		- 함수 구현 블록(클래스 구현 블록) 안에서 T 타입이 모호하기 때문에 구현이 불가능
	 * 		- Type Erasing의 결과 <T super type>는 Object이기 때문에 문법적 의미가 없다.
	 * 		- 결론은 존재하지 않는다.
	 */
	
//	public static <T super Shape> void drawShape(T t) {
//		t.draw();
//	}
	
	/**
	 * ?Generic Parameter Wildcard
	 * 
	 * 1) 제네릭 타입의 클래스를 사용할 때, 제한(extends, super와 함께)적으로
	 *  제너릭 타입을 결정해야 할 때 사용한다.
	 * 
	 * 2) 사용할 수 없는 예
	 * 	- 이 클래스를 제너릭 타입으로 정의할까?				
	 * 		MyStack<?> x
	 * 
	 *	- 이 클래스를  shape 자식의 제너릭 타입으로 정의할까?
	 *		 MyStack<? extends Shape> x
	 *
	 *	- 이 메소드의 첫 번째 파라미터를 제네릭 타입으로 할까? 
	 *		<?> void m(? t) x
	 *
	 *	- 이 메소드의 첫 번째 파라미터를 Shape 자식의 제네릭 타입으로 할까?
	 *		<? extends Shape m(? t) x
	 *
	 * 3) 사용할 수 있는 예
	 * 	- 제네릭 클래스 MyStack의 제네릭 파라미터를 Shape의 자식으로만 하자.
	 * 		MyStack<? extends Shape> o
	 * 
	 * - 제네릭 클래스 MyStack의 제네릭 파라미터를 Shape의 부모로만 하자.
	 * 		MyStack<? super Shape> o
	 */
	
	public static void drawShapeLayer(
			List<? extends Shape> in, // Producer, Lower Bounded
			Mystack <? super Drawable> out) { // Consumer, Upper Bounded
		
//		잘못된 사용
//		Mystack<? extends Shape> s1 = new Mystack<>(10);
//		s1.push(new Rect()));
		
		for(Shape s : in) {
			out.push(s);
		}
	}
	
}
