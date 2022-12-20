package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		String str;
		for(int i =1; i<100; i++) {
			String number = String.valueOf(i);
			char[] num = number.toCharArray();
			
			str = "";
//			System.out.println(num[i]);
			for (int j =0; j<num.length; j++) {
			if (num[j]%3==0 && num[j]!='0'){
				
				str += "짝";
			}
			}
			if (str != "") {
			System.out.println(i+str);
			}
		}
	}
}
