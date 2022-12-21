package prob05;

public class Account {
	private String accountNo; // 계좌번호
	private int balance; // 잔고
	
	// 입금 save, 출금 deposit 
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save(int getBalance) {
		this.balance += getBalance;
		System.out.println(accountNo + "계좌에 " + balance + "만원이 입금되었습니다." );
	}
	public void deposit(int setBalance) {
		this.balance -= setBalance;
		System.out.println(accountNo + "계좌에 "+ setBalance + "만원이 출금되었습니다." );
	}
	public Account(String account) {
		this.balance = 0;
		this.accountNo = account;
		System.out.println(this.accountNo+"계좌가 개설되었습니다.");
	}
}
