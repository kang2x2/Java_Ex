package Inheritance;

class div extends calculatorObject2 { //div��� �ڽ��� cal~~��� �θ��� �޼��峪 �ʵ带 ��밡��.
	
	public div(int num1, int num2) {
		super(num1, num2); // super = �θ�Ŭ���� ������  //(num1, num2) = this. 
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void calDiv() {
		System.out.println(this.num1 / this.num2);
	}
	
}

public class InheritanceBasic {

	public static void main(String[] args) {
		
		div d = new div(4, 2);
//		calculatorObject c = new calculatorObject(10,2);
		d.calPlus();
		d.calMinus();
		d.calMulti();
		d.calDiv();
	}

}
