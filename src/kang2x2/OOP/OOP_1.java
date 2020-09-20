package kang2x2.OOP;
//	다형성
class O {
	public void a(int a) {
		System.out.println("숫자: " + a);
	}
	public void a(String str) {
		System.out.println("문자: " + str);
	}
	public void a(double d, String a) {
		System.out.println("실수: " + d + a);
	}
	public void a1(double do1){
		
	}
}
class B extends O {
	public void a1(double do1) {
		System.out.println(do1);
	}
}
public class OOP_1 {

	public static void main(String[] args) {
		O obj = new B();
		obj.a(1);
		obj.a("ㅇㄹㅇㄹ");
		obj.a(3.14, "ei");
		obj.a1(3.1);
	}
	
}
