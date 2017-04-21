package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr=null;
		try {
			//읽어오는 코드값(언어)MS949
			//인코딩
			isr=new InputStreamReader(new FileInputStream("ms949.txt"),"MS949");
			//인풋스트림 리더(보조) : 파일인풋스트림이(주스트림)바이트단위로 읽어온 것을 문자단위로 바꿈
			int data=-1;
			while((data=isr.read())!=-1){
				System.out.print((char)data);
			}
		} 
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
