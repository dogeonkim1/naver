package day1213;

public class Ex6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		while(a<=90) {
			System.out.printf("%c",a++);//문자로 변환하여 출력
			System.out.print((char)a++);//char를 이용하여 문자로 변환 후 출력
		}
		System.out.println();
		//do~while문을 이용해서 a부터 z까지 출력
		char b='a';
		
		do {
			System.out.printf("%c",++a);
		}while(a<='z');
		
		//do~while문을 이용해서 a부터 z까지 출력
		System.out.println();
		do {
			System.out.print(b++);
		}while(b<='z');
		
		System.out.println();
		int n=0;
		while(n<=10) {
			n++;
			if(n%2==0)
				continue;//조건식으로 이동(whlie이나 do~while에서)
			System.out.printf("%3d",n);
		}
		

	}

}