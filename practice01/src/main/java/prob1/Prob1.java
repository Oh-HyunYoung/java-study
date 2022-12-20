package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		/* 코드 작성 */
			System.out.println("수를 입력하세요: ");
			int number = scanner.nextInt();
			if ((number%3) == 0){
				System.out.println("3의 배수입니다.");
			}
			scanner.close();
					
	}
}
