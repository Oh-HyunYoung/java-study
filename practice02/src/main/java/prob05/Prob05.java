package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {
	
			/* 게임 작성 */
			int cnt = 0;
			int min = 1;
			int max = 100;
			
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(max) + min;
			System.out.println("수를 결정하였습니다. 맞추어보세요 "+correctNumber);
	
			while(true){
				cnt++;
				int answer = scanner.nextInt();
				
				System.out.println(cnt+">>"); 
				System.out.println(min+"-"+max);
				
				if (correctNumber>answer) {
					min = answer;
					System.out.println("더 높게");
				}
				
				else if (correctNumber<answer) {
					max = answer;
					System.out.println("더 낮게");
				}
				
				else if(answer == correctNumber) {
					System.out.println("맞았습니다.");
					break;
				}
			}

			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}