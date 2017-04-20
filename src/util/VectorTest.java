package util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		
		//1.2이전 버전 메서드
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		//순회 1
		int count = v.size();
		for(int i=0; i<count; i++){
			String s=v.elementAt(i);
			System.out.println(s);
		}
		
		//삭제
		v.removeElementAt(1);
		
		//순회 2
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
