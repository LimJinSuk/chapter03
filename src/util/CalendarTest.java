package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Calendar cal = new Calendar(); 오류
		/*생성자 private 혹은  Abstract
		객체가 하나만 있어야 하는경우나 객체를 생성하는 다른 메서드가 있을 경우
		
		캘린더 클래스는 추상클래스라서 객체 생성이 안됨 static메서드 안에서 구현
		팩토리 패턴 : 객체 생성 메서드 따로있음(like 공장)이용
		*/
		//팩토리 패턴
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//특정 날짜 세팅하기
		cal.set(Calendar.YEAR, 1992);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 17);
		printDate(cal);
		//cal.set(1992,11,17);
		
		//기념일
		cal.add(Calendar.DATE, 10000);
		printDate(cal);
	}
	public static void printDate(Calendar cal){
		String[] days = {"일","월","화","수","목","금","토"};
		
		int year = cal.get(Calendar.YEAR);
		//0~11
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		//1(일)~7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int AM = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year+"."+month+"."+date+"."+days[day-1]);
		System.out.println((AM==0?"오전":"오후")+hour+":"+min+":"+sec);
	}

}
