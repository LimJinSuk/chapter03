package lang;

public class EqualsTest {

	public static void main(String[] args) {
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);
		Point pt3 = pt2;
		
		/*Point 객체비교 
		 * equals, hashCode 메서드가 오버라이드 되지 않은 경우*/
		
		//==연산자에서 두개의 항이 객체 참조 변수인 경우,
		//두 객체의 동일여부(동일성)을 체크함 .True/False
		System.out.println(pt1==pt2);
		
		System.out.println(pt2==pt3);
		
		//두 객체의 동질성 비교를 할 때에는 equals()사용.
		//equals가 오버라이드 되지 않은 경우는 ==연산자와 완전히 동일함.
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		/**String 객체비교
		 * equals, hashCode 메서드가 오버라이드 된 경우**/
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		String s3 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//hashCode 출력
		//String class에서 오버라이딩 된 해쉬코드는 내용을 기반으로 
		//셋다 동일한 해시코드를 갖게됨
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//참조값(객체 ID)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		/**String에 Literal 사용하는 경우
		 * JVM안의 리터럴(상수) 풀(pool)에서 객체 생성 관리를 하기 때문에
		 * 문자열 해싱값이 같은 문자열 객체는 2개이상 만들지 않는다.(메모리 낭비)**/
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;
		
		//new연산자로 생성할때와 다름
		System.out.println(str1==str2);//원래는 F 여기선 T로 나옴
		/*결국
		 * String str1 = "hello";
		 * String s1 = new String("hello");
		 * 둘은 서로 같지 않다. 
		 * */ 
		System.out.println(str2==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}

}
