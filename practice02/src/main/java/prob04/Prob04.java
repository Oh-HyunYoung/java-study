package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );

	}
	
	public static char[] reverse(String str) {
		
		int len = str.length(); 		// reverse의 길이 가져옴
		char[] result = new char [len]; 
		
		str.charAt(0);					// Str(String)에 저장된 문자열 중 한 글자만 선택해 char타입으로 변환
		for(int i =str.length()-1; i>=0; i--) {
			result[i] = str.charAt(str.length()-i-1); // str 뒤에서 부터 하나씩 result[] 배열에 넣어줌
		}
		return result;
	}

	public static void printCharArray(char[] array){
		
		for(char c:array) System.out.print(c); // c부터 array 열 출력
		System.out.println();

	}
}