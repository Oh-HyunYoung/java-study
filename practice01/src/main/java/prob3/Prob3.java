package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0; 
		/* 코드 작성 */
			System.out.println("수를 입력하세요: ");
			int number = scanner.nextInt();
			for (int i=1; i<=number; i+=2) {
				if (number%2==0) {
					sum +=i+1;
				}
				 else {
					 sum += i; 
				 }
			}
			System.out.println("결과 값 : "+sum);
			scanner.close();
	}
}
