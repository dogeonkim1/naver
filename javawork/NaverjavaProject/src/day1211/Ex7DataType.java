package day1211;

public class Ex7DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Candy";
		int age=32;
		float height=163.8f;
		double weight=56.7;
		char blood='B';
		/*
		 * 이름 : Candy님
		 * 나이 : 32세
		 * 키 : 163.8cm
		 * 몸무게 :56.7kg
		 * 혈액형 :b형
		 */
		//printf를 이용하여 위와같이 출력
		System.out.printf("이름:%s님\n",name);
		System.out.printf("나이:%d세\n",age);
		System.out.printf("키:%5.1fcm\n",height);
		System.out.printf("몸무게:%5.1fkg\n",weight);
		System.out.printf("혈액형:%c형\n\n",blood);
		//위와 같이 나오도록 println을 이용해 출력
		System.out.println("이름:"+name+"님");
		System.out.println("나이:"+age+"세");
		System.out.println("키:"+height+"cm");
		System.out.println("몸무게:"+weight+"kg");
		System.out.println("혈액형:"+blood+"형");

	}

}
