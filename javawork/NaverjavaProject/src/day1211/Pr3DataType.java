package day1211;

public class Pr3DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실수의 평균을 구해보자");
		//argument에 저장된 값을 double로 변환 후 평균을 구해보자
		
		double score1=Double.parseDouble(args[0]);
		double score2=Double.parseDouble(args[1]);
		double score3=Double.parseDouble(args[2]);
		double score4=Double.parseDouble(args[3]);
		double score5=Double.parseDouble(args[4]);
		double score6=Double.parseDouble(args[5]);
		double total=score1+score2+score3+score4+score5+score6;
		double average=total/6;
		
		System.out.println("국어:"+score1+"점");
		System.out.println("영어:"+score2+"점");
		System.out.println("수학:"+score3+"점");
		System.out.println("한국사:"+score4+"점");
		System.out.println("사탐1:"+score5+"점");
		System.out.println("사탐2:"+score6+"점");
		System.out.println("합계:"+total);
		System.out.println("평균:"+average);
		System.out.println("--------------------------");
		System.out.printf("국어:%5.1f점\n",score1);
		System.out.printf("영어:%5.1f점\n",score2);
		System.out.printf("수학:%5.1f점\n",score3);
		System.out.printf("한국사:%5.1f점\n",score4);
		System.out.printf("사탐1:%5.1f점\n",score5);
		System.out.printf("사탐2:%5.1f점\n",score6);
		System.out.printf("합계:%5.1f점\n",total);
		System.out.printf("평균:%5.1f점\n",average);
		System.out.println("---------------------------");
		System.out.printf("국어:%5.1f점\n영어:%5.1f점\n수학:%5.1f점\n한국사:%5.1f점\n사탐1:%5.1f점\n사탐2:%5.1f점\n",score1,score2,score3,score4,score5,score6);
		System.out.printf("합계:%5.1f점\n",total);
		System.out.printf("평균:%5.1f점\n",average);
		
	}

}
