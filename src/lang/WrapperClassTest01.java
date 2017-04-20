package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);//추천ㄴ 상수풀이 메모리 이득
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		//auto Boxing
		//상수 풀을 거쳐서 자동으로 new Integer(10)가 된다.
		Integer j=10;
		
		//auto Unboxing
		//int k=10+j.intValue();
		int k=10+j;
		
		//swap(j,k);
	}
	
	public void swap(Integer i, Integer j){
		//객쳉지만 내부를 수정할 수 없기 때문에 swap되지 않는다.
	}

}
