package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//정수값을 넣기위해 제네릭을 integer로 정의
		//List<Integer> list = new Vector<Integer>();
		
		//삽입
		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");
		
		//순회 1
		int count = list.size();
		for(int i=0; i<count; i++){
			String s = list.get(i);
			System.out.println(s);
		}
		
		//삭제
		list.remove(1);
		
		//순회 2
		//반복자 Iterator : 모든 컬렉션으로 부터 정보를 얻을 수 있는 인터페이스(컬렉션이라면 Iterator인터페이스 사용가능)
		Iterator<String> it = list.iterator();
		/** 모든 컬렉션 안에는 iterator()메서드가 있기 때문에 점찍고 사용하면 movie안에 있는 값들을 가져올 수 있다
		 *  이터레이터 객체 it에  ArrayList객체인  list배열 안에 있는 값들을 가져온다.
		 */
		while(it.hasNext()){//Iterator메서드 다음 값 존재 확인
			String s = it.next();//Iterator메서드 다음 값 리턴
			System.out.println(s);
		}
		
		//순회 3
		for(String s : list)
			System.out.println(s);
	}

}
