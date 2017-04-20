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
