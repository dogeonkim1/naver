package day1216;

public class Ex5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 클래스의 멤버 메소드에 대한 공부");
		String str1="Apple";
		String str2="Have a Nice Day!!";
		String str3="Orange";
		String str4=new String("dogeon");
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("str3="+str3);
		
		System.out.println("str2의 길이 :"+str2.length());
		System.out.println("str1의 0번글자"+str1.charAt(0));
		System.out.println("str2의 3번글자"+str2.charAt(3));
		System.out.println("str3의 1번글자"+str3.charAt(1));
		
		System.out.println();
		System.out.println("str1에서 l의 위치:"+str1.indexOf('l'));//3
		System.out.println("str2에서 a의 위치:"+str2.indexOf('a'));//1 : 첫번째 a의 위치
		System.out.println("str2에서 마지막 a의 위치:"+str2.lastIndexOf('a'));//13
		System.out.println("str3에서 x의 위치는:"+str3.indexOf('x'));//해당 문자가 없을 경우 -1이 발생
		System.out.println();
		
		//객체타입에서는 ==동등 연산자가 주소를 비교하는 연산자
		System.out.println(str1==str4);
		System.out.println(str1=="Apple");
		System.out.println(str3=="Orange");
		System.out.println(str1=="apple");

	}

}