package day1212;

import java.util.Scanner;

public class Ex10Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *상품(sang)과 수량(su), 단가(dan)를 입력받은 후
		 *총 금액(total)을 출력하시오.
		 *예시
		 *상품명:바나나킥
		 *수량:5개
		 *단가:1000원
		 *총금액:4500원
		 *
		 */
		Scanner sc=new Scanner(System.in);
		String name;
		int su,dan,total;//int 정수형
		System.out.println("상품명 입력");
		name=sc.nextLine();
		System.out.println("수량과 단가");
		su=sc.nextInt();
		dan=sc.nextInt();
		System.out.println("총 금액");
		total=(int)(su*dan);
		total = su<5?su*dan:(int)((su*dan)*0.9);//조건su<5가 참일때 su*dan값 도출/거짓일 때 (su*dan)*0.9값 도출
		System.out.println("총 가격은"+total+"원"+(su<5?"":"(할인됨)"));
		

	}

}