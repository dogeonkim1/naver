package day1213;

import java.util.Scanner;

public class Ex9While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 한글자씩 입력하다가 x(대소문자 상관없음)를 입력하면 빠져나와서
		 * 입력한 데이터를 분석한 결과를 출력
		 * 
		 * 대문자3
		 * 소문자4
		 * 숫자3
		 */
		char ch;
		int upper=0,lower=0,number=0; //증감연산자 사용할거라 초기값 설정
		
		while(true) {
			System.out.println("문자입력(종료:x");
			ch=sc.nextLine().charAt(0);
			if(ch=='x'||ch=='X')
				break;
			
//			if(ch>='a'&& ch<='z')
//				lower++;
//			else if(ch>='A' && ch<='Z')
//				upper++;
//			else if(ch>='0' && ch <='9')
//				number++;
			
			if(ch>=97 && ch<=122)
				lower++;
			else if(ch>=65 && ch<=90)
				upper++;
			else if(ch>=48 && ch <=57)
				number++;
		}
		System.out.println("대문자:"+upper);
		System.out.println("소문자:"+lower);
		System.out.println("숫 자:"+number);

	}

}
