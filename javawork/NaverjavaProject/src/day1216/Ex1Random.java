package day1216;

import java.util.Random;

public class Ex1Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *난수를 구하는 방법는 2가지가 있음
		 *1. Math.random()
		 *2. Random() 
		 */
		System.out.println("Math.random()은 0.0보다 크거나 같고 1.0보다 작은 난수 발생");
		for(int i=1;i<=5;i++)
		{
			System.out.println(Math.random());
		}
		System.out.println("0~9사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10);
			System.out.println(n+"");
		}
		System.out.println("");
		System.out.println("0~99사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*100);
			System.out.println(n+"");
		}
		System.out.println();
		System.out.println("1~10사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10)+1;
			System.out.println(n+"");
		}
		System.out.println();
		System.out.println("Random클래스를 이용해서 난수 구하기");
		Random r=new Random();
		System.out.println("1~10까지의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(10)+1;
			System.out.print(n+" ");//char로 문자 형 변환
		}
		System.out.println();
		System.out.println("A~Z까지의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(26)+65;
			System.out.print((char)n+" ");//char로 문자 형 변환
		}
		System.out.println();
		System.out.println("a~z까지의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(26)+97;
			System.out.print((char)n+" ");//char로 문자 형 변환
		}
		System.out.println();
	}

}

















