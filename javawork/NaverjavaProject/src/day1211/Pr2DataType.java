package day1211;

public class Pr2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("argument 를 spring으로 변환 후 도출해보자");
		
		String name=args[0];
		String man=args[1];
		String girl=args[2];
		double date=Double.parseDouble(args[3]);
		int money=Integer.parseInt(args[4]);
		String way=args[5];
		
		System.out.println("인사말 :"+name+"환영합니다");
		System.out.println("남자 :"+man+"님");
		System.out.println("여자 :"+girl+"님");
		System.out.println("날짜 :"+date+"일");
		System.out.println("축의금 :"+money+"이상");
		System.out.println("오시는 길 :"+way);
		System.out.println("---------------");
		System.out.printf("인사말:%s 환영합니다.\n",name);
		System.out.printf("남자:%s님\n 여자:%s님\n",man,girl);
		System.out.printf("날짜:%5.2f일\n",date);
		System.out.printf("오시는길:%s입니다",way);
	}

}
