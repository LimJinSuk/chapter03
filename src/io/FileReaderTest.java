package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis=null;
		try {
			//"안녕하세요"
			//문자기반-5번읽음
			fr = new FileReader("hello.txt");
			//한글 -3바이트 구성(UTF-8)
			//바이트기반 스트림=15번을 읽음
			fis = new FileInputStream("hello.txt");
			int count=0;
			int data=-1;
			while((data=fr.read())!=-1){//파일 존재
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은 횟수 : "+count);
			System.out.println("--------------------");
			
			count = 0;
			while((data=fis.read())!=-1){
				count++;
				System.out.println((char)data);
			}
			System.out.println("\n읽은 횟수 : "+count);
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일 없음:"+e);
		}
		catch(IOException e){
			System.out.println("IO error"+e);
		}
		finally{
			try{
				if(fr!=null)
					fr.close();
				if(fis!=null)
					fis.close();
			}
			catch(IOException e){
				System.out.println("IO error"+e);
			}
		}
	}

}
