package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br=null;
		try {
			//주스트림 꽂기,char단위
			//현재소스를 읽어와서 라인단위로 출력
			//문자기반 스트림에서 보조스트림과 주스트림의 차이는 생성자에 들어가는 변수가 다르다는것.
			//주스트림 = 파일자체 , 보조스트림 = 주스트림 파일리더 라이터 객체
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
			br = new BufferedReader(fr);
			
			int i=0;
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(++i+":"+line);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(br!=null)
					br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
