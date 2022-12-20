package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int cnt = 0;
		System.out.println("금액 : ");
		int money = scanner.nextInt();
		for (int i:MONEYS) {
			
			while(true) {
				if(money-i>=0) {
					money-=i;
					cnt++;
				}
				else {
					break;
				}
			}
			System.out.println(i+":"+cnt+"개");
		}
		scanner.close();
 	}
}