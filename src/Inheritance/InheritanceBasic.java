package Inheritance;

class div extends calculatorObject2 { //div라는 자식은 cal~~라는 부모의 메서드나 필드를 사용가능.
	
	public div(int num1, int num2) {
		super(num1, num2); // super = 부모클래스 생성자  //(num1, num2) = this. 
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
