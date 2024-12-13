package day1212;

public class Pr4Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sci=75, hist =85, art =75;
		boolean pass = true;
		
		System.out.println(sci > hist);//예상 출력f
		System.out.println(sci < hist);//예상 출력t
		System.out.println(sci == art);//예상 출력f
		System.out.println(sci != art);//예상 출력t
		System.out.println(sci < hist&& ++sci > art);//예상 출력f
		System.out.println(sci);//예상 출력t
		System.out.println(hist > art || ++art < sci);//예상 출력t
		System.out.println(art);//예상 출력t
		System.out.println(!(sci < hist));//예상 출력f
		System.out.println(!pass);//예상 출력f
		

	}

}
