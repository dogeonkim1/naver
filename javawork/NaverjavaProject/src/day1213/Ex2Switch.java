package day1213;

import java.util.Scanner;

public class Ex2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		char ch;
//		
//		System.out.println("알파벳 한글자 입력");
//		ch=sc.nextLine().charAt(0);//입력한 문자열중 첫글자를 char타입으로 반환
//		
//		switch(ch)
//		{
//		case 'a':
//		case 'A':
//			System.out.println("Apple");
//			break;
//		case 'b':
//		case 'B':
//			System.out.println("Banana");
//			break;
//		case 'c':
//		case 'C':
//			System.out.println("Computer");
//			break;
//		default:
//			System.out.println("a,b,c가 아닌 알파벳");
//			
//		}
		
		System.out.println("영어 단어를 입력해주세요");
		String msg=sc.nextLine();
		
		//jdk8이후 문자열도 가능해짐
		switch(msg) {
		case "red":
		case "RED":
			System.out.println("빨강색");
			break;
		case "green":
		case "GREEN":
			System.out.println("초록색");
			break;
		default:
			System.out.println("그 외 색상");
		}
		

	}

}