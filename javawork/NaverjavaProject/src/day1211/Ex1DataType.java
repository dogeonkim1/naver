package day1211;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=127;
		byte b=(byte)128;//(byte):강제 형변환 - cast연산자
		byte c=(byte)200;
		byte d=(byte)161;
		System.out.println("a="+a);//127
		System.out.println("b="+b);//-128:틀린값 도출,범위를 벗어남
		System.out.println("c="+c);//-56:2의 보수로 계산되서 나온 값
		System.out.println("d="+d);//-95

	}

}
