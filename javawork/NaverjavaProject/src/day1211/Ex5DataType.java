package day1211;

public class Ex5DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 char타입은 2바이트(한글 한글자도 온전히 저장 가능)
		char ch1='A';
		char ch2='가';
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		
		//printf로 출력시 변환기호가 1글자:%c, 문자열:%s
		System.out.printf("ch1=%d\tch2=%d\n",(int)ch1,(int)ch2);//ascii code로 변환되서 출력
		
		int a=65;
		System.out.println(a);//65
		System.out.println(a+32);//97
		System.out.println((char)a);//A
		System.out.println((char)(a+32));//a
		
		//printf를 이용해서 출력해보자
		System.out.printf("%c,%c,%c,%c\n",a,a,a+2,a+33);
		//ascii code표를 이용해 Hello를 출력해보세요.
		System.out.printf("%c%c%c%c%c",65+7,65+36,65+43,65+43,65+46);

	}

}
