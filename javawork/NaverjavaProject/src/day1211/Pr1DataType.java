package day1211;

public class Pr1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("println, printf를 사용하여 결과를 도출해보자");
		
		String name="김도건";
		String havite="서울";
		int birthYear=1997;
		int age=2024-birthYear;
		double average=64.5;
		
		System.out.println("이름 :"+name);
		System.out.println("사는곳 :"+havite);
		System.out.println("출생년도 :"+birthYear);
		System.out.println("나이 :"+age);
		System.out.println("----------------------");
		System.out.printf("이름 :%s님\n",name);
		System.out.printf("사는곳 :%s중랑구\n",havite);
		System.out.printf("출생년도 :%d년\n",birthYear);
		System.out.printf("나이 :%d세\n",age);
		System.out.printf("몸무게 :%3.2fkg\n",average);
		
		

	}

}
