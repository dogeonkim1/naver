package day1212;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자, ++변수(전치 연산자:1순위), 변수++(후치 연산자:끝순위)
		int a,b,m,n;
		a=b=5;
		m=++a;//먼저 a가 증가된 후 m으로 대입된다.
		n=b++;//먼저 대입 후 b가 증가된다.
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//%d 정수 변환 기호
		
		a=b=m=n=5;//재선언
		m=a++*++b;//5(후치)*6(전치)=30
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//%d 정수 변환 기호
		
		n=a++ + ++b;//6+7
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//%d 정수 변환 기호
		
		a=5;
		System.out.println(a++);//먼저 출력 후 증가
		System.out.println(++a);//앞서 출력 후 증가되었기 때문에 여기와서 6으로 시작;먼저 증가 후 출력
		
		a=b=m=n=5;
		a*=b-- - ++n*3;//전치 n먼저 증가 후 3곱 후 후치 계산= -6*3 - 5계산 후 a(5)*-13
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//%d 정수 변환 기호
		
		m*=b-- + ++n*2;//n=7, b=4, 14+4
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//%d 정수 변환 기호

	}

}
