package day1212;

import java.util.Scanner;

public class Pr9Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		double age,price;
		System.out.println("이름을 입력해주세요.");
		name=sc.nextLine();
		System.out.println("나이와 가격을 입력해주세요.");
		age=sc.nextDouble();
		price=sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+"세 이며 현재 가치는 "+price+"원 입니다.");

	}

}
