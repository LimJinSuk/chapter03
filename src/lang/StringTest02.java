package lang;

public class StringTest02 {

	public static void main(String[] args) {
		String str1="abc";
		String str2="cde";
		String str3=str2;
		
		//str3의 내용을 대문자로 바꾸는 것.
		//사실상 직접 바꾸는 것은 아니고 배열복사후 복사된 배열을 수정하여 리턴해줌.
		str2=str3.toUpperCase();
		System.out.println(str1);
		
		//새로운 배열을 가르키게 됨(참조)
		System.out.println(str2);
		System.out.println(str3);
		
		//문자+문자 concat
		String str4 = str2.concat("??");//str+??문자 새로운 객체
		System.out.println(str2);//str2는 변하지 않음
		System.out.println(str4);
		
		//메서드 체인
		"!".concat(str4);//이 자체가 하나의 객체
		String str5 = "!".concat(str4).concat("@");//객체.메서드형식 계속 쓸 수 있음
		System.out.println(str5);
	}

}
