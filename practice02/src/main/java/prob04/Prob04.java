package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
		
		//StringBuffer sb = new StringBuffer();
		

	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		int len = str.length();
		char[] result = new char [len]; //뒤집는 알고리즘 찾기 result를 뒤집
		
		str.charAt(0);
		for(int i =str.length()-1; i>=0; i--) {
			result[i] = str.charAt(str.length()-i-1);
		}
		return result;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for(char c:array) System.out.print(c);
		System.out.println();

	}
}