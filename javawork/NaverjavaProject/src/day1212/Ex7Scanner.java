package day1212;

import java.util.Scanner;

public class Ex7Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//키보드로부터 입력시
		String word;
		System.out.println("문장을 입력해 보세요");
//		word=sc.next();//한 단어만 읽어온다.
//		System.out.println("내가 입력한 단어는 \""+ word+"\"입니다.");//"는 \"로 기입 가능
		
		word=sc.nextLine();//엔터를 누르면 그 한줄을 통째로 읽어옵니다.
		System.out.println("내가 입력한 문장은 \""+ word+"\"입니다.");
		
		int age;
		System.out.println("나이를 입력하세요.");//숫자만 입력 가능
		age=sc.nextInt();
		System.out.println("내 나이는"+age+"세 입니다.");

	}

}
