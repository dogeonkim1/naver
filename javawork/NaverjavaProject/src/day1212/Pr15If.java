package day1212;

import java.util.Scanner;

public class Pr15If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 *상품(item)과 수량(ea), 단가(price)를 입력받은 후
		 *총 금액(total)을 출력하시오.
		 *단, 수량이 5개 이상이면 총 금액의 10프로를 할인한 가격으로 다시 출력(dctotal)
		 *
		 *예시
		 *상품명:바나나킥
		 *수량:5개
		 *단가:1000원
		 *총금액:5000원
		 *
		 *10프로 할인된 가격은 4500원 입니다 => 5개 이상인 경우에만 출력되는 문장
		 */
		
		String item;
		int ea,price,total,dctotal;
		
		System.out.println("상품을 입력하세요");
		item=sc.nextLine();
		System.out.println("수량을 입력하세요");
		ea=sc.nextInt();
		System.out.println("가격을 입력하세요");
		price=sc.nextInt();
		total=ea*price;
		System.out.println("총 금액은"+total+"원 입니다");
		
		if(ea>=5)
		{
			dctotal=total*9/10;
			System.out.println("할인 가격은"+dctotal+"원 입니다");
			
		}
		

	}

}