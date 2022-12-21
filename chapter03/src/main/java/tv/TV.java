package tv;

public class TV {
	private int channel; // 1~255
	private int volume; // 0~100
	private boolean power;
	
	private void power(boolean on) {
		this.power = on;
	}
	
	private void channel(boolean up) {
		
	}
	
	private void volume(int channel) {
		
	}
	
	private void volume(boolean up) {
		
	}
	private void status() {
		System.out.println("TV[power="+(power?"on":"off")+","+"channel="+channel+","+"volume="+volume+"]");
	}
}
