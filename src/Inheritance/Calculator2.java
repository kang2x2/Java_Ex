package Inheritance;

class calculatorObject2 {
	public int num1, num2;
	
/*	�ƹ��͵� ���� �⺻ �����ڸ� ��������� �̷��� ��������� ������ 
	�ؿ� ��������� ����� ���� �Ű������� ���� �����ڸ� ����� �ξ��⿡ �ڹٴ� �Ͻ������� 
	�ƹ��͵� ���� �⺻ �����ڸ� ����� ���� �ʾ� extends�� �̿��Ͽ� ����� ��ų �� ������ ����.*/
	public calculatorObject2(){} // == ��ӹ޴� Ŭ������ super(num1, num2)�� �ִ�.
//	/////////////////////////////////////////////////////////
	public calculatorObject2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
//	public void setNum(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}
	
	public void calPlus() {
		System.out.println(this.num1 + this.num2);
	}
	public void calMinus() {
		System.out.println(this.num1 - this.num2);
	}
	public void calMulti() {
		System.out.println(this.num1 * this.num2);
	}
}

public class Calculator2 {
	
	public static void main(String[] args) {
		
	}
	
}
