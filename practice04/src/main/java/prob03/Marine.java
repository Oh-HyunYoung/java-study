package prob03;

public class Marine{
	// 현재 위치
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.move(x, y);
	}

	void stop(int x, int y) {
		/* 현재 위치에 정지 */
		this.stop(x,y);
	}
	
	void stimPack(int x, int y) { 
		/* 스팀팩을 사용한다.*/
		this.stimPack(x,y);
	}	
}
