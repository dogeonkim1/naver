package day1211;

public class Ex9Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이상욱
		 * 삼성전자
		 * 홍보부
		 * 89
		 * 100
		 * 74
		 * 
		 * 
		 * 
		 * 이름(name), 회사명(emp) ,부서(dep)	
		 * 3과목의 입사시험점수(score1, score2, score3)
		 * 를 읽어서 위의 데이터와 입사시험의 총합계(total)과
		 * 평균(average)-소수점 첫째자리까지만 출력(printf)
		 */
		String name=args[0];
		String emp=args[1];
		String dep=args[2];
		int score1=Integer.parseInt(args[3]);
		int score2=Integer.parseInt(args[4]);
		int score3=Integer.parseInt(args[5]);
		int total=score1+score2+score3;
		double average=total/3.00;
		
		System.out.println("이름 :"+name);
		System.out.println("회사명 :"+emp);
		System.out.println("부서 :"+dep);
		System.out.println("과목1 :"+score1);
		System.out.println("과목2 :"+score2);
		System.out.println("과목3 :"+score3);
		System.out.println("총점 :"+total);
		System.out.printf("평균 :%5.2f점",average);

	}

}
