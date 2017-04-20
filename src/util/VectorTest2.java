package util;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
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
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//순회 3
		for(String s : list)
			System.out.println(s);
	}

}
