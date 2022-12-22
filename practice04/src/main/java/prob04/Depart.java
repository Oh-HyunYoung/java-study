package prob04;

public class Depart extends Employee{
	private String depart;
	public Depart(String i,int j, String depart) {
		super(i,j);
		this.depart = depart;
		
		
	}
	public void getInformation() {
		System.out.println( "이름:" + getName() + " 연봉:" + getSalary() +" 부서:"+depart);
	}
}
