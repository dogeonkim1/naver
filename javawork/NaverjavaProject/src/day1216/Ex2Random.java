package day1216;

import java.util.Scanner;

public class Ex2Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 1~100사이의 임의의 수 rnd를 발생 후
		 * 숫자 알아맞추기
		 * (Ex)
		 * 1회 : 50
		 * 		50보다 큽니다
		 * 2회 : 80
		 * 		80보다 작습니다
		 * 		.
		 * 		.
		 * 6회 : 60
		 * 		정답입니다 =>맞출경우 프로그램 종료
		 */
		Scanner scanner=new Scanner(System.in);
		int su,rnd,n=0;
		
		rnd=(int)(Math.random()*100)+1;
		while(true)
		{
			System.out.print(++n+"회");
			su=sc.nextInt();
			if(su>rnd)
				System.out.println(su+"보다 작습니다.");
			else if(su<rnd)
				System.out.println(su+"보다 큽니다");
			else {
				System.out.println("정답입니다.");
				break;
			}
		}

	}

}
