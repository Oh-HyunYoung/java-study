package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 1 ] );
			
			Arithmetic arithmetic = null;
			int n;
			/* 코드 작성 */
			switch( tokens[ 2 ] ) {
			case "+" : {
				arithmetic = new Add();
				n=arithmetic.calculate(lValue, rValue);
				break;
			}
			case "-" : {
				arithmetic = new Sub();
				n=arithmetic.calculate(lValue, rValue);
				break;
			}
			case "*" : {
				arithmetic = new Mul();
				n=arithmetic.calculate(lValue, rValue);
				break;					
			}
			case "/" : {
				arithmetic = new Div();
				n=arithmetic.calculate(lValue, rValue);
				break;
			}
		}
	
			int result = arithmetic.calculate(lValue, rValue);
			System.out.println( ">> " + result );
		}
		
		scanner.close();
	}



}