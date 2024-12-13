package day1212;

import java.util.Scanner;

public class Pr10Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 *상품(item)과 수량(ea), 단가(price)를 입력받은 후
		 *총 금액(total)을 출력하시오.
		 *예시
		 *상품명:인형
		 *수량:10개
		 *단가:5000원
		 *총금액:50000원
		 *
		 *단 3개 이상 구매 시 5% 할인.
		 */
		
		String name;
		int ea,price,total;
		
		System.out.println("구매하려는 상품명을 기입해주세요.");
		name=sc.nextLine();
		System.out.println("개수와 가격을 적어주세요.");
		ea=sc.nextInt();
		price=sc.nextInt();
		total=ea*price;
		total=ea<5?ea*price:(int)((ea*price)*0.95);//개수가 5개보다 많을때 개수 곱하기 가격 곱하기0.95
		System.out.println("총 가격은 "+total+"입니다"+(ea<5?"":"(할인됨)"));//개수가5개 이상이면 '할인됨'이라는 단어 나옴

	}

}
