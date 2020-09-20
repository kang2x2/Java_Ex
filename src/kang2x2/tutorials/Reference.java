package kang2x2.tutorials;

class A {
	public int id;
	A(int id) {
		this.id = id;
	}
}

public class Reference {

//	기본데이터형 복제 = Ex) 복사본 만들기.
//	출력결과 1.
	public static void runValue() {
		int a = 1; //a에 1을 대입.
		int b = a; //b에 a를 대입.
		b = 2; //b에 2를 대입.
		System.out.println("runValue: " +a); // b의 값은2지만 a의 값은 1이다.
//		b라는 변수는 a를 복제한 것 뿐이기에 각각 다른 변수. 즉, b를 바꾼다고 a는 바뀌지 않음.  
	}
	
//	참조데이터형 참조 = Ex) 바로가기 만들기.
//	출력결과 2. 
	public static void runReference() {
		A a = new A(1); //new를 이용해 객체를 인스턴스화 시킴.(매개변수인 id로 1을 입력.)
		A b = a; // b에도 
		b.id = 2; //b의 id값을 2로 바꿈. 
		System.out.println("runReference: " +a.id); // 결과는 2이다.
//		b는 a를 복제하는것이 아닌 참조. 즉, b라는 변수는 독립된게 아닌 a를 참조하는 변수이기에 b를 바꾸면 a도 바뀜.  
	}
	
	public static void main(String[] args) {

		runValue();
		runReference();
		
	}

}
