package day1212;

import java.util.Scanner;

public class Ex14If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int score;//score가 숫자이기 때문에 int로 선언
		String grade;//string 큰 따옴표, char 작은따옴표
		
		System.out.println("점수를 입력해주세요.");
		score=sc.nextInt();
		
		//점수가 0~100의 값을 벗어나면 메서드를 종료
		//if(!(score>=0&&score<=100))
		if(score<0||score>100)
		{
			System.out.println("값의 범위를 벗어났습니다.");
			return;//현재 메서드를 종료한다
		}//조건문이 여러개일 경우 중괄호로 묶어서 구역을 나눠준다.
	
		
		
		if(score>=90)
			grade="A";
		else if(score>=80)
			grade="B";
		else if(score>=70)
			grade="C";
		else if(score>=60)
			grade="D";
		else
			grade="F";
		
		System.out.printf("%d점의 학점은 %s학점입니다\n",score,grade);

	}

}
