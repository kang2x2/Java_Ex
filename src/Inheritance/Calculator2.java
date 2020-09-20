package Inheritance;

class calculatorObject2 {
	public int num1, num2;
	
/*	아무것도 없는 기본 생성자를 명시적으로 이렇게 만들어주지 않으면 
	밑에 명시적으로 만들어 놓은 매개변수를 가진 생성자를 만들어 두었기에 자바는 암시적으로 
	아무것도 없는 기본 생성자를 만들어 주지 않아 extends를 이용하여 상속을 시킬 때 에러가 난다.*/
	public calculatorObject2(){} // == 상속받는 클래스에 super(num1, num2)가 있다.
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
