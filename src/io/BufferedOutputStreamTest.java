package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try {
			//생성자에 파일명 들어가면 주스트림
			FileOutputStream fos = new FileOutputStream("123.txt");
			//생성자에 주스트림 객체가 들어가면 보조스트림
			//5=버퍼 사이즈
			bos = new BufferedOutputStream(fos,5);
			
			
			for(int i='1'; i<'9'; i++){
				bos.write(i);
				//명시적호출 : 버퍼가 가득차지 않아도 디스크에 기록
				bos.flush();
			}
			fos.close();
			/*for(int i=49; i<=57; i++){
			} 코드값으로 해석*/
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음"+e);
		}
		catch(IOException e){
			System.out.println("IO error"+e);
		}
		finally{
			try{//보조스트림을 닫으면 주스트림도 닫힘
				//하나만 닫으면 됨
				if(bos!=null)
					bos.close();
			}
			catch(IOException e){
				System.out.println("IO error"+e);
			}
		}

	}

}
