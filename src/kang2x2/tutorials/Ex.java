package kang2x2.tutorials;

public class Ex {

	public static void main(String[] args) {
//		���ڿ�
		String css = "CSS";
		String html = "HTML";
		String java = "JAVASCRIPT";
		System.out.println(css + "\n" + html + "\n" + java);
		
//		����
		int a = 1;
		double b = 1.4;
		System.out.println(1 + a + b);
		
//		����ȯ
		int num = 3; //������ 3
		float flo = 1.0F;//�Ǽ���(float) 1.0
		double val = num + flo;//�ڵ����� ������ ���� num�� float���� �ǰ� ����� double��  ������ ���
//								double�� ���� �ٲ��.
		System.out.println(val);

//		������ ����.
		int aa = 10;
		int bb = 3;
		
		float cc = 10.0F;
		float dd = 3.0F;
		
		System.out.println(aa/bb); //3
		System.out.println(cc/dd); //3.333
		System.out.println(aa/dd); //3.333
//		���׿�����
//		++2, --2 ���� �ϳ��� ���� ������ ����.
//		���׿�����
//		1 + 2, 3 - 1 ���� �ΰ��� ���� ������ ����.
	}

}
