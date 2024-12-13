//Apple.java로 컴파일 하기 위한 기본 자반 클래스를 생성해보세요

public class Apple
{
	public static void main(String []args)
	{
		System.out.println(args[0]); //args의 0번 배열값을 출력
		System.out.println(args[1]); //args의 1번 배열값을 출력

		System.out.println("두수를 더해보자");
		System.out.println(args[0]+args[1]); //문자열이라 10,20 입력시 1020이 나온다

		//문자열을 계산을 하기 위한 숫자로 변환 하려면 integer.parselnt를 사용한다
		int su1=Integer.parseInt(args[0]);
		int su2=Integer.parseInt(args[1]);
		System.out.println("두 수의 합은"+(su1+su2)+"입니다");
	}
}
