package day1216;

import java.util.Scanner;

public class Ex3Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 임의의 난수를 구한 후 숫자 알아맟추기
		 * 맞췄을 경우 
		 * 계속 하시겠습니까? y
		 * 		=>새로운 난수 발생, count변수 0으로 초기화
		 * y가 아닐경우 = 프로그램 종료
		 */
		int su,rnd,count;
		
		
		
		Exit:  //레이블은 대소문자 상관없이 임의로 지정하면 된다
			while(true)
			{
				rnd=(int)(Math.random()*100)+1;
				count=0;

				while(true)
				{
					System.out.println(++count+"회 :");
					//su=sc.nextInt();
					su=Integer.parseInt(sc.nextLine());
					if(su>rnd)
						System.out.println(su+"보다 작습니다.");
					else if(su<rnd)
						System.out.println(su+"보다 큽니다");
					else {
							System.out.println("정답입니다");
							System.out.println("계속 하려면 y,아니면n");
							char ch=sc.nextLine().charAt(0);
							if(ch=='y'||ch=='Y') {
								System.out.println("새로운 난수를 발생합니다.");
							break;//현재 속한 while문만 빠져나온다
							//continue Exit;사용시 바깥쪽 반복문의 조건식으로 이동
						}else {
							break Exit;
						}
					}
				}
			}
		System.out.println("프로그램을 종료합니다.");

	}

}
