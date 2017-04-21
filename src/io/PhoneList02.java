package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
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
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){//라인 있을경우 계속 읽음
				String name = scanner.next();//자동으로 토큰 정리
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				
				System.out.println(name+" : "+phone1+"-"+phone2+"-"+phone3);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
