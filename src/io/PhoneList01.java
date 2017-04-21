package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			if(file.exists()==false){//file 존재하지 않을 경우
				System.out.println("파일이 존재 하지 않습니다.");
				return; //=System.exit(0) 0:정상종료,1:비정상종료/강제종료
			}
			System.out.println("========파일 정보========");
			System.out.println("파일 경로 : "+file.getAbsolutePath());
			System.out.println("파일 크기 : "+file.length()+"Bytes");//byte 단위
			
			//file.lastModified()바로쓰면 날짜 안맞음! date클래스 공부할때 이상했던 것 처럼
			Date d=new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("수정 날짜 : "+sdf.format(d));
			
			System.out.println("========전화 번호========");
			
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");	
			br = new BufferedReader(isr);
			
			String line = null;
			while((line=br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line,"\t ");
				
				int index=0;
				while(st.hasMoreTokens()){//토큰이 있냐(총 토큰 4개)
					String s = st.nextToken();
					if(index==0)
						System.out.print(s+" : ");
					else if(index==1)
						System.out.print(s+"-");
					else if(index==2)
						System.out.print(s+"-");
					else 
						System.out.print(s);
					index++;
				}
				System.out.println("");
			}
			
		} catch (FileNotFoundException e) {
			//위에 if문 없을지도 몰라서 만들라고 하는것.
			//가독성을 위해 try문을 아예 맨위로 올려버렸음.
			e.printStackTrace();
		} catch(UnsupportedEncodingException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
