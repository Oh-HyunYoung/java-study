package chapter03;

import mypackage.Value;

	public class Swaptest03 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println("a:"+a.Val+", b:"+b.Val);
		
		swap(a,b);
		
		System.out.println("a:"+a.Val+", b:"+b.Val);
		}
		public static void swap(Value m, Value n) {
			int temp = m.Val;
			m.Val = n.Val;
			n.Val =temp;
		
	}

}
