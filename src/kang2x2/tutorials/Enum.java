package kang2x2.tutorials;


enum Fruit { //enum
	APPLE("red"), BANANA("yellow"), PEACH("pink");
//	아래의 것과 같음.
//	public static final Fruit APPLE = new Fruit(); 
	
	private String color;
	
	public String getColor() {
		return this.color;
	}
	
//	생성자.
	Fruit(String color) {
		this.color = color;
		System.out.println("생성자를 이용한 호출.");
	}
}
enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class Enum {

	public static void main(String[] args) {
		
		Fruit type = Fruit.BANANA;
		
		switch(type){
		case APPLE:
			System.out.println("사과: " + Fruit.APPLE.getColor() );
			break;
		case BANANA: 
			System.out.println("바나나 " + Fruit.BANANA.getColor() );
			break;
		case PEACH:
			System.out.println("복숭아 " + Fruit.PEACH.getColor() );
			break;
		}
		
		
		
	}

}
