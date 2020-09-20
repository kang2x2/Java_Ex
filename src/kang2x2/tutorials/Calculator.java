package kang2x2.tutorials;
import Inheritance.*; //��Ű���� ��� Ŭ������ ������ ��?
//import Inheritance.Calculator2; //��Ű�� ���� �������� ���� Ŭ������.

//		���赵(Ŭ����)
class CalculatorObject {
	
//	������ ���� �տ� static�� ������ Ŭ���������� �޼���, �׷��� ������ �ν��Ͻ����� Ȥ�� �޼���?
	static int staticNum = 314; // ��� �ν��Ͻ����� ��� ������ Ŭ���� ����
	int leftNum;
	int rightNum;
	
//	������ (�ݵ�� Ŭ������ �̸��� ���ƾ��Ѵ�!!)
	public CalculatorObject(int num1, int num2) {
//		���������� ��������(Ȥ�� �Ű�����)�� �̸��� ���ٸ� ���������� �տ� this�� ������.
		leftNum = num1;
		rightNum = num2;
	}
	
//	�����ڸ� ������� �ʴ� Ŭ���� ������ �����ϱ�.
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
		
		
//	      ��ü�� �̸��� ���� ��������   �ν��Ͻ�(������ ��ü)    ��ü(Ŭ������ ������ ���� �����Ǳ� ���� ��ü)
		CalculatorObject cal = new CalculatorObject(5, 4);
//		cal.setNum(5, 4); �ν��Ͻ� ����? �����ڸ� ������� ���� ��� �ν��Ͻ��� �޼��带 �̿��Ͽ� ���� �����Ѵ�.
		cal.sum();
		cal.minus();
		
//		��Ȱ�뼺
		CalculatorObject cal2 = new CalculatorObject(6, 2);
//		cal2.setNum(6, 2); �ν��Ͻ� ����? �����ڸ� ������� ���� ��� �ν��Ͻ��� �޼��带 �̿��Ͽ� ���� �����Ѵ�.
		cal2.sum();
		cal2.minus();
		
//		�����ڸ� �̿��� ȣ��
		CalculatorObject cal3 = new CalculatorObject(10, 20);
		cal3.sum();
		cal3.minus();
		
//		Ŭ�������� ȣ��
		System.out.println(cal.staticNum);
		System.out.println(cal2.staticNum);
		System.out.println(CalculatorObject.staticNum);
		
	}
	
}
