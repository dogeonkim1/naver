package day1212;

import java.util.Scanner;

public class Book94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int charCode;
		charCode=sc.nextInt();
		
		
		if((65<=charCode)&&(charCode<=90)) {
			System.out.println(charCode+"는 대문자입니다.");
		}
		if((95<=charCode)&&(charCode<=122)) {
			System.out.println(charCode+"소문자입니다.");
		}
		if((48<=charCode)&&(charCode<=57)) {
			System.out.println(charCode+"숫자입니다.");
		}
		
		//-------------------------------------------------
		
		int value;
		value=sc.nextInt();
		
		if((value%2==0)||(value%3==0)) {
			System.out.println(value+"2 또는 3의 배수군요");
		}
		
		boolean result = (value%2==0||(value%3==0));
		if(!result) {
			System.out.println(value+"2또는 3의 배수가 아니군요.");
		}

	}

}
