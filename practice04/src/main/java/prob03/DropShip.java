package prob03;

public class DropShip{
	// 현재 위치
	private int x;
	private int y;

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
	}

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

	void stop(int x, int y) {
		/* 현재 위치에 정지 */
		this.stop(x,y);
	}
	
	void load(int getX, int getY) {
		/* 선택된 대상을 태운다.*/ 
		this.load(getX,getY);
	}
	
	void unload(int setX, int setY) {
		/* 선택된 대상을 내린다.*/ 
		this.unload(setX, setY);
	}
}