package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		int b=0;
		
		for(int i =1; i<10; i++) {
			for(int j=i;j<i+10; j++) {
				System.out.print(j + " ");
				b++;
				if(b%10==0) {
					System.out.println();
				}
			}
			
		}
	}
}
