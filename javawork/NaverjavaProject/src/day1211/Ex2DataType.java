package day1211;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=93;
		System.out.println("합계="+kor+eng);//String+int+int:묵시적 형변환에 의해서 String+int=String
		//int+int=int이므로 먼저 계산을 해야만 한다.
		System.out.println("합계="+(kor+eng));//괄호로 묶어 int끼리 먼저 계산
		
		//진법변환
		int a=056;//앞에 0을 붙이면 8진수로 인식함
		int b=0x12a;//0x를 붙이면 16진수로 인식함
		int c=047;
		int d=0xa9;
		System.out.println("a="+a);//8진수를 10진수로 변경:5x8+6x8의0승(1)=46
		System.out.println("b="+b);//16진수를 10진수로 변경:1x16의2승+2x16의1승+10x16의0승
		System.out.println("c="+c);//4x8+7=39
		System.out.println("d="+d);//10x16+9=169

	}

}
