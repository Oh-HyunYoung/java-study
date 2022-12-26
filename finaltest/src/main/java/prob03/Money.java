package prob03;

public class Money {
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money(int i) {
		this.amount = i;
	}

	public Money add(Money m) {
		Money add = new Money(getAmount()+m.getAmount());
		return add;
	}

	public Money minus(Money m) {
		Money minus = new Money(getAmount()-m.getAmount());
		return minus;
	}

	public Money multiply(Money m) {
		Money multiply = new Money(getAmount()*m.getAmount());
		return multiply;
	}

	public Money devide(Money m) {
		Money devide = new Money(getAmount()/m.getAmount());
		return devide;
	}
	
	public boolean equals (Money m) {
		return getAmount() == m.getAmount();
	}
	

}
