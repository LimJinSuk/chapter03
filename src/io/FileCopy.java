package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
		public static void main(String[] args) {
		
		//finally 에서 스트림 닫아주기위해 전역변수로 지정
		FileInputStream fis = null;
		FileOutputStream fos =null;
		
		try {
			//프로젝트명./ 현재 위치
			fis = new FileInputStream("./S_4.gif");//파일명
			fos = new FileOutputStream("./S_4.gif");
			
			int data=-1;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일 없음:"+e);
		}
		//while 문에서 파일을 읽어오지 못할경우 오류를 여기서 잡음
		catch(IOException e){
			System.out.println("I/O 오류:"+e);
		}
		//무조건 실행
		finally{//예외의 경우와 잘 실행될 경우 모두 스트림 닫아주기
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				System.out.println("I/O 오류:"+e);
			}
			
		}
	}

}
