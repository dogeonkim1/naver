package day1212;

import java.util.Date;

public class Pr6Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today=new Date();
		
		int curYear=today.getYear()+1900;
		int curMonth=today.getMonth()+1;
		int curDate=today.getDate();
		
		System.out.println("오늘은"+curYear+"년"+curMonth+"월"+curDate+"일 입니다.");
		
		//요일
		int weekDay=today.getDay();
		
		char week=
				weekDay == 0 ? '일':
			    weekDay == 1 ? '월':
				weekDay == 2 ? '화':
				weekDay == 3 ? '수':
				weekDay == 4 ? '목':
				weekDay == 5 ? '금':'토';
		System.out.println("오늘은 "+week+" 입니다.");
					
		

	}

}
