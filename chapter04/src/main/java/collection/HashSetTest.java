package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너"); // 값으로 구분함
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s1);
		//s.add(s2); // 같은 값 두 개를 넣어도 하나만 출력됨
		
		System.out.println(s.size());
		System.out.println(s.contains(s2));
		
		// 순회1
		for(String str : s) {
			System.out.println(str);
		}
	}

}
