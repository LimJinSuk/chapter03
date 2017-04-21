package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		//finally 에서 close할 것
		BufferedReader br=null;
		try {
			//기반 스트림은 생성할 필요 없음 
			//키보드 연결된 system.in(표준 입력)사용
			InputStreamReader isr = new InputStreamReader(System.in,"utf-8");
			//보조스트림
			br = new BufferedReader(isr);
			
			while(true){//파일끝아닌경우
				System.out.print(">>");
				
				String line = br.readLine();
				if(line==null)//문자열 아닐경우 break
					break;
				if("exit".equals(line)==true)
					break;
				System.out.println(line);
			}
		} 
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
