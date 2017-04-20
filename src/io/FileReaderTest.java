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
			fr = new FileReader("hello.txt");
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
