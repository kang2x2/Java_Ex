package kang2x2.OOP;
//	Interface
//	��ȭ���
interface call {
	public void call(String callNum);
}
//	���ӱ��
interface game {
	public void game();
}
//	�ڵ���
class Phone implements call, game{
	public void call(String callNum){
		System.out.println("��ȭ��ȣ: " + callNum);
	}
	public void game(){
		System.out.println("���ӽ���");
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
