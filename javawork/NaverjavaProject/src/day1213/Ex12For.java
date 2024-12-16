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
		
		
		System.out.println("값을 입력하세요");//값 입력하라고 안내
		int n= sc.nextInt();//값 입력받음(엔터칠때까지 근데 이제 숫자를 곁들인)
		int sum=0;//결과를 0으로 초기화
		
		for(int i=1;i<=n;++i)//자그럼 반복하는데 변수 i를 1로 초기화 하고 i가 n보다 작거나 같을 동안 계속 돌려
							  //근데 반복될때마다 1씩 증가시키는거야
			sum+=i;			  
		System.out.print(+sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
