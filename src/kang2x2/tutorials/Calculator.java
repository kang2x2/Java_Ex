package kang2x2.tutorials;
import Inheritance.*; //패키지의 모든 클래스를 가져올 때?
//import Inheritance.Calculator2; //패키지 내의 가져오고 싶은 클래스만.

//		설계도(클래스)
class CalculatorObject {
	
//	데이터 형의 앞에 static이 붙으면 클래스변수나 메서드, 그렇지 않으면 인스턴스변수 혹은 메서드?
	static int staticNum = 314; // 모든 인스턴스에서 사용 간으한 클래스 변수
	int leftNum;
	int rightNum;
	
//	생성자 (반드시 클래스와 이름이 같아야한다!!)
	public CalculatorObject(int num1, int num2) {
//		전역변수와 지역변수(혹은 매개변수)가 이름이 같다면 전역변수의 앞에 this를 붙이자.
		leftNum = num1;
		rightNum = num2;
	}
	
//	생성자를 사용하지 않는 클래스 변수에 대입하기.
//	public void setNum(int num, int num2) {
//		this.leftNum = num;
//		this.rightNum = num2;
//	}
	
	public void sum() {
		System.out.println(this.leftNum + this.rightNum);
	}
	
	public void minus() {
		System.out.println(this.leftNum - this.rightNum);	
	}
}

public class Calculator {
	
	public static void main(String args[]) {
		
		Calculator2 c2 = new Calculator2();
		
		
//	      객체의 이름을 가진 데이터형   인스턴스(구현된 실체)    객체(클래스의 내용을 토대로 구현되기 전의 실체)
		CalculatorObject cal = new CalculatorObject(5, 4);
//		cal.setNum(5, 4); 인스턴스 변수? 생성자를 사용하지 않을 경우 인스턴스의 메서드를 이용하여 수를 대입한다.
		cal.sum();
		cal.minus();
		
//		재활용성
		CalculatorObject cal2 = new CalculatorObject(6, 2);
//		cal2.setNum(6, 2); 인스턴스 변수? 생성자를 사용하지 않을 경우 인스턴스의 메서드를 이용하여 수를 대입한다.
		cal2.sum();
		cal2.minus();
		
//		생성자를 이용한 호출
		CalculatorObject cal3 = new CalculatorObject(10, 20);
		cal3.sum();
		cal3.minus();
		
//		클래스변수 호출
		System.out.println(cal.staticNum);
		System.out.println(cal2.staticNum);
		System.out.println(CalculatorObject.staticNum);
		
	}
	
}
