package day1212;

public class Ex4operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관계연산자(>,<,>=,<=,==,!=), 논리연산자(&&,||,!{and, or, not}) =>결과값은 무조건 boolean(true/false)
		int kor=89,eng=100,mat=89;
		boolean f=false;
		
		System.out.println(kor>eng);//false
		System.out.println(kor<eng);//true
		System.out.println(kor==mat);//true
		System.out.println(kor!=mat);//false
		System.out.println(kor>eng && ++eng>mat);//false false && true:첫번째 조건이 거짓일 경우 두번째 조건은 비교하지 않는다.
		System.out.println(eng);//그대로 100
		System.out.println(kor>eng || ++eng>mat);//true false || true:첫번째 조건이 진실일 경우 두전째 조건은 비교하지 않는다.
		System.out.println(eng);//위 조건에서 첫번째 항목이 거짓->두번째 비교 후 전치 증가
		System.out.println(!(kor>eng));//true
		System.out.println(!f);//true
		

	}

}
