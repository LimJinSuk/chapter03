package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		printDate(now);
		printDate2(now);
		
		//특정시간 세팅 2000/4/21
		Date d2 = new Date(100,3,21);
		printDate(d2);
		
		//특정시간 세팅 13:25:30
		Date d3 = new Date(100,3,21,13,25,30);
		printDate(d3);
		
		//1970.1.1.00:00:00.000기준
		//milliseconds 값 세팅
		long milliseconds = 24L*60*60*1000*365*30;//하루 밀리세컨즈의 양*1년*30년
		Date d4 = new Date(milliseconds);
		printDate(d4);
	}
	
	public static void printDate(Date date){
		//SimpleDateFormat 이용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. a hh:mm:ss");
		System.out.println(sdf.format(date));
	}
	public static void printDate2(Date date){
		int year = date.getYear()+1900;//년도+1900
		int month = date.getMonth()+1;//월 0~11
		int day = date.getDate();
		int hour=date.getHours();
		int minutes = date.getMinutes();
		
		System.out.println(year+"."+month+"."+day+" "+hour+":"+minutes);
	}
}
