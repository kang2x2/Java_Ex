package kang2x2.tutorials;


enum Fruit { //enum
	APPLE("red"), BANANA("yellow"), PEACH("pink");
//	�Ʒ��� �Ͱ� ����.
//	public static final Fruit APPLE = new Fruit(); 
	
	private String color;
	
	public String getColor() {
		return this.color;
	}
	
//	������.
	Fruit(String color) {
		this.color = color;
		System.out.println("�����ڸ� �̿��� ȣ��.");
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
			System.out.println("���: " + Fruit.APPLE.getColor() );
			break;
		case BANANA: 
			System.out.println("�ٳ��� " + Fruit.BANANA.getColor() );
			break;
		case PEACH:
			System.out.println("������ " + Fruit.PEACH.getColor() );
			break;
		}
		
		
		
	}

}
