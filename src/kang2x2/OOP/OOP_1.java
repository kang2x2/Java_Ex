package kang2x2.OOP;
//	������
class O {
	public void a(int a) {
		System.out.println("����: " + a);
	}
	public void a(String str) {
		System.out.println("����: " + str);
	}
	public void a(double d, String a) {
		System.out.println("�Ǽ�: " + d + a);
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
		obj.a("��������");
		obj.a(3.14, "ei");
		obj.a1(3.1);
	}
	
}
