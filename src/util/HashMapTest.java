package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//인터페이스 리터널 
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("둘리", new Integer(100));
		map.put("마이콜", 50);
		map.put("도우넛", 90);//박싱
		map.put("둘리", 95); //100끊어버리고 새로 연결
		
		//auto unboxing
		//int score = map.get("마이콜");//마이콜의 점수,
		
		//프레임 워크 객체들만 사용할 거얏
		Integer score = map.get("마이콜");
		System.out.println(score);
		//둘리라는 내용을 가지고 찾아옴,새로운 객체 생성이 아님
		System.out.println(map.get(new String("둘리")));
		
		//평균(맵은 키로만 접근이 가능함 키 이용)
		Set<String> keySet = map.keySet();
		int count = keySet.size();
		
		//순회하며 키 뽑음
		int sum=0;
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			//System.out.println(key);
			int s = map.get(key);
			sum=sum+s;
		}
		
		System.out.println("평균 : "+sum/count);
	}

}
