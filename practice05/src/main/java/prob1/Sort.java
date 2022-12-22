package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		for(int i = 0; i < array.length; i++) {
	        for(int j = 0 ; j < array.length - i - 1 ; j++) {
	            if(array[j] < array[j+1]) {
	                int temp = array[j+1];
	                array[j+1] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			
			System.out.print(array[i] + " ");
		}		
	}
}
