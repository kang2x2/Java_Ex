package kang2x2.OOP;
//	Interface
//	전화기능
interface call {
	public void call(String callNum);
}
//	게임기능
interface game {
	public void game();
}
//	핸드폰
class Phone implements call, game{
	public void call(String callNum){
		System.out.println("전화번호: " + callNum);
	}
	public void game(){
		System.out.println("게임실행");
	}		
}

public class Interface {

	public static void main(String[] args) {
		Phone p = new Phone();
		call c = new Phone();
		game g = new Phone();
		
		c.call("010-9462-2303");
		g.game();
	}
	
}
