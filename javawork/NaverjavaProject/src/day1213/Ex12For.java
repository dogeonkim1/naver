package day1213;

import java.util.Scanner;

public class Ex12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//사용자에가 값을 받기 위해
		/*
		 * 문제1
		 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오
		 * (for문 사용할것)
		 */
//		System.out.println("값을 입력해주세욧");//사용자에게 값을 입력하라고 안내
//		int n= sc.nextInt();//사용자에게로부터 값을 받음
//		int sum = 0;
//		
//		for(int i=1;i<=n;i++)
//			sum+=i;
//		System.out.println("1부터"+n+"까지는"+sum+"입니다");
		
		
		System.out.println("값을 입력하세요");
		int n= sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;++i)
			sum+=i;
		System.out.print(+sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
