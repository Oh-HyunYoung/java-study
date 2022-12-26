package prob01;

public class Printer {

	public int println;
	public int getPrintln() {
		return println;
	}
//	public void println(int i) {
//		System.out.println(i);
//	}
//	public void println(boolean i) {
//		System.out.println(i);
//	}
//	public void println(double i) {
//		System.out.println(i);
//	}
//	public void println(String i) {
//		System.out.println(i);
//	}
	public <T> void println(T... ts) {
		for(T t:ts) {
		System.out.println(t);
		}
	}
	
	public int sum(Integer... nums) {
		int s= 0;
		for(Integer n:nums) {
			s +=n;
		}
		return s;
	}
	

}