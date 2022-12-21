package tv;

public class TV {
	private int channel; // 1~255 boolean->int
	private int volume; // 0~100
	private boolean power;

	public TV(int i, int j, boolean b) {
		this.channel = i;
		this.volume = j;
		this.power = b;
	}

	public void power(boolean on) {
		if (on) {
			System.out.println("on");
		} else {
			System.out.println("off");
		}
	}

	public void channel(boolean up) { // int -> boolean
		if (up) {
			if (this.channel + 1 > 255) {
				this.channel = 1;
			} else {
				this.channel += 1;
			}
		} else {
			if(this.channel -1 < 1) {
				this.channel = 255;
			} else {
				this.channel -=1;
			}
		}
	}

	public void volume(int volume) {
		this.volume = volume;
		if (this.volume > 100) {
			this.volume = 0;
		}
	}

	public void channel(int channel) {
		this.channel = channel;
		if (this.channel > 255) {
			this.channel = 0;
		}
	}

	public void volume(boolean up) {
		if (up) {
			if (this.volume + 1 > 100) {
				this.volume = 0;
			} else {
				this.volume += 1;
			}
		} else {
			if (this.volume - 1 < 0) {
				this.volume = 100;
			} else {
				this.volume -= 1;
			}
		}
	}

	public void status() {
		System.out.println(
				"TV[power=" + (power ? "on" : "off") + "," + "channel=" + channel + "," + "volume=" + volume + "]");
	}
}