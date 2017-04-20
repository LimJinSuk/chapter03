package lang;

public class StringTest01 {

	public static void main(String[] args) {
		//문자"escape
		String s="I say \"hello\""; //I say "hello"
		System.out.println(s);
		
		//문자 'escape
		char c='\'';//'
		System.out.println(c);
		
		//문자 \ escape
		String s1="C:\\jx372";
		System.out.println(s1);
		
		//\t,\n,\r
		System.out.println("\\n");
		System.out.println("");
		
		//+연산이 가능함
		String s4 = "Hello"+"World";
		System.out.println(s4);
		System.out.println(s4.charAt(5));
		
		//내부 문자(배)열 가져오기
		char[] cs = s4.toCharArray();
		System.out.println(cs);
	}

}
