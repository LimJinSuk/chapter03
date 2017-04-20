package lang;

public class RectTest {

	public static void main(String[] args) {
		Rect r1 = new Rect(10,20);
		Rect r2 = new Rect(10,20);
		
		//다른객체 같은 내용
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		//해쉬코드 오버라이드 되면서 내용기반으로 됨 = 같은내용
		System.out.println(r1.hashCode()==r2.hashCode());

	}

}
