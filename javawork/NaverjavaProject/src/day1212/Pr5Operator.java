package day1212;

import java.util.Scanner;

public class Pr5Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// 삼항 연산자 연습 문제
		// 문제 1: a, b 중 더 큰 값을 구하세요.
        int a,b,c,max;
        a=7;
        b=12;
        c=9;
        
        max=a>b?a:b;
        System.out.println("큰 값은 "+max+"입니다.");
        
        max=b>c?b:c;
        System.out.println("큰 값은"+max+"입니다.");
        
        // 문제 2: a, b, c 중 가장 큰 값을 구하세요.
        max= a > b && a > c ? a : (b > c ? b : c);
        System.out.println("큰 값은"+max+"입니다.");
        
        // 문제 3: 100~90은 A, 89~80은 B, 79~70은 C, 69~60은 D, 나머지는 F로 평가하는 삼항 연산자를 작성하세요.
        System.out.println("점수를 입력해주세요.");
        int score;
        score=sc.nextInt();
        char grade;
        
        grade=score >=90 ? 'A':
	          score >=80 ? 'B':
	          score >=70 ? 'C':
	          score >=60 ? 'D':'F';
	    System.out.println("당신의 학점은"+grade+"입니다.");
	    
	 // 문제 4: 점수가 90 이상이면 "Excellent", 80~89면 "Great", 70~79면 "Good", 나머지는 "Keep Trying"을 출력하는 삼항 연산자를 작성하세요.
	    System.out.println("점수를 입력하세요.");
	    int num;
	    num=sc.nextInt();
	    String rank;
	    
	    rank=num >= 90 ? "Excellent":
	    	 num >= 80 ? "Great":
	    	 num >= 70 ? "Good":"Go die";
	    System.out.println("당신은"+rank);
	    //점수가 60점 밑이면 나가죽어 라는 말 추가
	    System.out.println(num+"??"+(num >=60 ? "나쁘지않아":"나가죽어"));
	    
	    
	    
	 
	    
	}

}
