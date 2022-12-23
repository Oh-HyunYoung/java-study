package prob3;

public class Duck extends Bird{
	
	public void fly(String name) {
		this.name = name;
		System.out.println(name+"("+getName()+")는 날지 않습니다.");
	}
	
	public void sing(String name) {
		this.name = name;
		System.out.println(name+"("+getName()+")가 소리내어 웁니다.");
		
	}
}
