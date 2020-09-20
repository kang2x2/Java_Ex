package kang2x2.tutorials;

public class Ex {

	public static void main(String[] args) {
//		문자열
		String css = "CSS";
		String html = "HTML";
		String java = "JAVASCRIPT";
		System.out.println(css + "\n" + html + "\n" + java);
		
//		변수
		int a = 1;
		double b = 1.4;
		System.out.println(1 + a + b);
		
//		형변환
		int num = 3; //정수형 3
		float flo = 1.0F;//실수형(float) 1.0
		double val = num + flo;//자동으로 연산을 위해 num은 float형이 되고 결과는 double형  변수에 담겨
//								double형 으로 바뀐다.
		System.out.println(val);

//		연산자 응용.
		int aa = 10;
		int bb = 3;
		
		float cc = 10.0F;
		float dd = 3.0F;
		
		System.out.println(aa/bb); //3
		System.out.println(cc/dd); //3.333
		System.out.println(aa/dd); //3.333
//		단항연산자
//		++2, --2 같은 하나의 수만 가지고 연산.
//		이항연산자
//		1 + 2, 3 - 1 같은 두개의 수를 가지고 연산.
	}

}
