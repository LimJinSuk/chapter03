package lang;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "abcAbcabcABC";
		
		//charAt
		System.out.println(s.charAt(2));
		
		//indexOf
		System.out.println(s.indexOf("Abc"));
		System.out.println(s.indexOf("xyz"));//존재하지 않는경우 index=-1
		
		//치환
		System.out.println(s.replace('a', 'R'));
		System.out.println(s);//기존것 바뀌지않음
		
		System.out.println(s.replace("bc", "12"));
		System.out.println(s.replaceAll("bc", "12"));
		
		//substring
		//index=3부터 index=7전(=6)까지
		System.out.println(s.substring(3, 7));
		
		//toLowerCase
		System.out.println(s.toLowerCase());
		
		String str1 = " ab cd";
		String str2 = ",efg ";
		
		//concat
		System.out.println(str1+str2);
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim 공백제거
		System.out.println("--"+str1+"--");
		str1=str1.trim();
		System.out.println("--"+str1+"--");//사이드공백 제거
		
		//split
		String[] tokens = str1.split(",");//,를 경계로서 분리 return 배열
		for(String str : tokens)
			System.out.println(str);
		
		//split 예외
		tokens="abcdefg".split(",");
		for(String str : tokens)
			System.out.println(str);
		
		tokens="".split(",");
		System.out.println(tokens.length);
	}

}
