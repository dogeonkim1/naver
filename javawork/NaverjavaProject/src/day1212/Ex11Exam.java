package day1212;

import java.util.Date;
import java.util.Scanner;

public class Ex11Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 년(year), 월(month), 일(day)를 입력 후
		 * 해당 날짜에 대한 date글래스를 생성 후(myDate)
		 * myDate를 이용해서 년, 월, 일, 요일(week)을 구해서 출력
		 * 요일은 요일 숫자(weekNum)를 먼저 얻은 후 요일을 구해서 출력
		 */
		int year, month, day, weekNum;
		String week;
		Date myDate;
		System.out.println("년도 입력");
		year=sc.nextInt();
		System.out.println("월 입력");
		month=sc.nextInt();
		System.out.println("일 입력");
		day=sc.nextInt();
		
		//입력한 날짜에 대한 Date클래스 생성
		myDate=new Date(year-1900, month-1, day);
		
		weekNum=myDate.getDay();//요일숫자
		
		System.out.println("년도:"+(myDate.getYear()+1900));
		System.out.println("월:"+(myDate.getMonth()+1));
		System.out.println("일:"+myDate.getDate());
		System.out.println((
				weekNum==0?"일":
				weekNum==1?"월":
				weekNum==2?"화":
				weekNum==3?"수":
				weekNum==4?"목":
				weekNum==5?"금":'토')+"요일입니다");
		
		
		
		
		
		
		
		
//		Date today=new Date(); 
//		int year=today.getYear()+1900;
//		int month=today.getMonth()+1;
//		int day=today.getDay();
//		int weekend=today.getDay();
//		System.out.println(""+weekend);
//		
//		char week=
//				weekend == 0 ? '일':
//				weekend == 1 ? '월':
//				weekend == 2 ? '화':
//				weekend == 3 ? '수':
//				weekend == 4 ? '목':
//				weekend == 5 ? '금':'토';
//					
//		
//		System.out.println("현재년도:"+year);
//		System.out.println("현재달:"+month+"월");
//		System.out.println("현재일:"+day+"일");
//		System.out.println("오늘은"+weekend+"요일");
		

	}

}
