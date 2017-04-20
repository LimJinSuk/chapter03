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
			isr=new InputStreamReader(new FileInputStream("ms949.txt"),"MS949");
			
			int data=-1;
			while((data=isr.read())!=-1){
				System.out.print((char)data);
			}
			System.out.println(data);
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
