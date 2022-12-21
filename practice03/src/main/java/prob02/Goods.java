package prob02;

public class Goods {
	private String name;
	private int price;
	private int countStock;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public void show() {
		System.out.println(name+"(가격:"+price+"원)이 "+countStock+"개 입고 되었습니다.");
	}

}
