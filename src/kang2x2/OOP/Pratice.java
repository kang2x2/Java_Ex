package kang2x2.OOP;
//�߻�, ���, ����ó��.

//	���� Ŭ����.
abstract class Calculator {
	int left, right;
	
	public void setNum(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
//	�߻�޼��� ����.(�߻�޼���� ����(�߰�ȣ ���� ����)�� ����� �Ѵ�.)
	public abstract void sum();
	public abstract void minus(); 
	public abstract void division(); 
	public String toString() {
		return "left: " + this.left + ", right: " + right;
	}
//	run�̶�� �޼��� �ȿ� �߻� �޼��� sum�� minus�� ����.
	public void run() {
		sum();
		minus();
		division();
	}

}

//	���.(�߻� �޼��带 ���� Ŭ������ ����ϱ� ���ؼ��� �θ��� �߻� �޼��带 ���� �������̵� �ؾ� �Ѵ�.)
class CalculatorPlus extends Calculator {
	public void sum() {
		try {
			System.out.println(this.left + this.right); 			
		} catch(Exception e) {
			System.out.println("����" + e.getMessage());
		}			
	}
	public void minus() {

	}
	public void division() {
		
	}
}
//���.(�߻� �޼��带 ���� Ŭ������ ����ϱ� ���ؼ��� �θ��� �߻� �޼��带 ���� �������̵� �ؾ� �Ѵ�.)
class CalculatorMinus extends Calculator {
	public void sum() {
		
	}
	public void minus() {
		try {
			System.out.println(this.left - this.right); 			
		} catch(Exception e) {
			System.out.println("����" + e.getMessage());
		}	
	}
	public void division() {
		
	}
}
//���.(�߻� �޼��带 ���� Ŭ������ ����ϱ� ���ؼ��� �θ��� �߻� �޼��带 ���� �������̵� �ؾ� �Ѵ�.)
class CalculatorDivi extends Calculator {
	public void sum() {
		
	}
	public void minus() {

	}
	public void division() {
		try {
			System.out.println(this.left / this.right); 			
		} catch(Exception e) {
			System.out.println("����" + e.toString());
		}		
	}
}

//	���� Ŭ����.
public class Pratice {

//	�Ű������� �θ�Ŭ������ �־� ����.
	public static void ex(Calculator c) {
		try {
			System.out.println("����");
			c.run();			
		} catch(Exception e) {
			System.out.println("����" + e.getMessage());
		}

	}
	
//	����(����) �޼���.
	public static void main(String[] args) {
		Calculator cal = new CalculatorPlus();
		cal.setNum(40, 10);
		Calculator cal2 = new CalculatorMinus();
		cal2.setNum(30,10);
		Calculator cal3 = new CalculatorDivi();
		cal3.setNum(30,5);
		
//		�Ű������� �ڽ� Ŭ�������� �ν��Ͻ��� �Է��Ͽ� ����.
		System.out.println(cal);
		ex(cal);
		ex(cal2);
		ex(cal3);
	}
	
}
