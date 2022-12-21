package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
								
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i<COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] infos = info.split(" ");
			System.out.println(infos[0]+":"+infos[1]+":"+infos[2]);
			
			goods[i] = new Goods();
			goods[i].setName(infos[0]);
			goods[i].setPrice(Integer.valueOf(infos[1]));
			goods[i].setCountStock(Integer.valueOf(infos[2]));
			
		}
		// 상품 출력
		for(int j =0; j<COUNT_GOODS; j++) {
			goods[j].show();	
		}
		// 자원정리
		scanner.close();
	}
}
