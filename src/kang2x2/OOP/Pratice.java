package kang2x2.OOP;
//추상, 상속, 예외처리.

//	계산기 클래스.
abstract class Calculator {
	int left, right;
	
	public void setNum(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
//	추상메서드 생성.(추상메서드는 로직(중괄호 안의 내용)이 없어야 한다.)
	public abstract void sum();
	public abstract void minus(); 
	public abstract void division(); 
	public String toString() {
		return "left: " + this.left + ", right: " + right;
	}
//	run이라는 메서드 안에 추상 메서드 sum과 minus를 실행.
	public void run() {
		sum();
		minus();
		division();
	}

}

//	상속.(추상 메서드를 가진 클래스를 상속하기 위해서는 부모의 추상 메서드를 전부 오버라이딩 해야 한다.)
class CalculatorPlus extends Calculator {
	public void sum() {
		try {
			System.out.println(this.left + this.right); 			
		} catch(Exception e) {
			System.out.println("오류" + e.getMessage());
		}			
	}
	public void minus() {

	}
	public void division() {
		
	}
}
//상속.(추상 메서드를 가진 클래스를 상속하기 위해서는 부모의 추상 메서드를 전부 오버라이딩 해야 한다.)
class CalculatorMinus extends Calculator {
	public void sum() {
		
	}
	public void minus() {
		try {
			System.out.println(this.left - this.right); 			
		} catch(Exception e) {
			System.out.println("오류" + e.getMessage());
		}	
	}
	public void division() {
		
	}
}
//상속.(추상 메서드를 가진 클래스를 상속하기 위해서는 부모의 추상 메서드를 전부 오버라이딩 해야 한다.)
class CalculatorDivi extends Calculator {
	public void sum() {
		
	}
	public void minus() {

	}
	public void division() {
		try {
			System.out.println(this.left / this.right); 			
		} catch(Exception e) {
			System.out.println("오류" + e.toString());
		}		
	}
}

//	메인 클래스.
public class Pratice {

//	매개변수로 부모클래스를 주어 실행.
	public static void ex(Calculator c) {
		try {
			System.out.println("실행");
			c.run();			
		} catch(Exception e) {
			System.out.println("오류" + e.getMessage());
		}

	}
	
//	메인(실행) 메서드.
	public static void main(String[] args) {
		Calculator cal = new CalculatorPlus();
		cal.setNum(40, 10);
		Calculator cal2 = new CalculatorMinus();
		cal2.setNum(30,10);
		Calculator cal3 = new CalculatorDivi();
		cal3.setNum(30,5);
		
//		매개변수로 자식 클래스들의 인스턴스를 입력하여 실행.
		System.out.println(cal);
		ex(cal);
		ex(cal2);
		ex(cal3);
	}
	
}
