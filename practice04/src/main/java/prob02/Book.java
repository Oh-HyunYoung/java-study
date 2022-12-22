package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo,String title,String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
		this.stateCode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	public void print() {
		System.out.print("["+bookNo+"]"+" 책 제목:"+this.title+", 작가:"+this.author+", 대여 유무:");
		if(this.stateCode==1) {
			System.out.println("재고있음");
		}else {
			System.out.println("대여중");
		}
	}
}
