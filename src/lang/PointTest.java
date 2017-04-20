package lang;

public class PointTest {

	public static void main(String[] args) {
		Point pt = new Point();
		
		System.out.println(pt.getClass().getName());//클래스 네임
		System.out.println(pt.hashCode());//객체id,객체 레퍼런스값
		
		//getClass().getName()+"@"+hashCode();
		System.out.println(pt.toString());//기본구현=클래스이름@해시코드 값
		
		System.out.println(pt);
		
		/*cf. String 객체와 비교*/
		String s = new String("hello");
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.toString());//toString 오버라이딩
		System.out.println(s);
	}

}
