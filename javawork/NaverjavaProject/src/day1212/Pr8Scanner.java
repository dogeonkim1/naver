package day1212;

import java.util.Scanner;

public class Pr8Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		System.out.println("성함을 입력하세요.");
		name=sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age=sc.nextInt();
		
		System.out.println("당신의 성함은"+name+"이며 나이는"+age+"입니다.");

	}

}
