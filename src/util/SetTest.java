package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//
		Set<Value> set = new HashSet<Value>();
		
		Value v1 = new Value(10);
		Value v2 = new Value(5);
		Value v3 = new Value(1);
		Value v4 = new Value(10);
		
		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);
		
		//Value안에 10내용을 가진것이 포함되어있는가? 내용비교
		System.out.println(set.contains(new Value(10)));
		
		//삭제
		//값(내용)으로 삽입,삭제 이루어짐
		set.remove(new Value(10));
		
		//순회
		//순차적이지 않은 set은 iterator을 통해서만 출력가능
		//해시코드 오버라이딩 하지 않는경우 중복된경우도 다 나옴
		Iterator<Value> it=set.iterator();
		while(it.hasNext()){
			Value v = it.next();
			System.out.println(v);
		}
	}

}
