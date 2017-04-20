package lang;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		//지정 문자가 숫자인지 판별
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));
		
		
		/**s=1234 경우 잘 나오지만
		 *  s=123a4경우 에러가 남
		 *  파싱전에 isDigit()로 숫자인지 판별후 파싱하도록(에러 안나게)
		 */
		
		String s = "123a4";
		//정규식을 통해 숫자인지 구분
		if(s.matches("-?\\d+(\\.\\d+)?")==false)
			System.out.println("숫자가 아닙니다.");
		else{
			int i = Integer.parseInt(s);
			System.out.println(i);
			}
		
		//로직프로그램 로직(변수 검증...)try~catch 문으로 하지 말 것
		/*
		 * try{
		 
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println("숫자가 아닙니다");
		}
		*/
		
		System.out.println(Integer.parseInt("A", 16));//16진수A를 숫자로
		System.out.println(Integer.toBinaryString(256));//256을 이진수로
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
		System.out.println(String.valueOf(12345));//long,double->String
	}	

}
