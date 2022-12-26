package prob01;

public class Gugudan {
	private int lValue;
	private int rValue; //set 9개 다른 수 넣기 
	// 값 일일히 비교 말고 다른 equals, hashcode 써서 하기 
	// 아니면 9개 될때까지 for문..
	
	public Gugudan(int lValue, int rValue) {
		this.lValue = lValue;
		this.rValue = rValue;
	}
}