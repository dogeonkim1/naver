package day1218;

class Orange
{
	public static final String MESSAGE="Happy";
	
	private String name;
	private String age;
	
	public void showData()
	{
		//일반 멤버 메서드는 this라는 인스턴스 변수를 가지고 있다.
		//static 멤버 메서드에는 this가 없음
		//따라서 this.name 이런식으로 접근 가능(this는 경우에 따라 생략 가능)
		System.out.println("이름:"+this.name+"나이:"+this.age);
	}
}
public class Ex8Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Orange.MESSAGE);
		
		Orange orange=new Orange();
		//System.out.println(orange.name);//오류:private 변수는 직접 접근 불가
		orange.showData();

	}

}
