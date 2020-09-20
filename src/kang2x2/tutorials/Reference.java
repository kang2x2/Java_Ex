package kang2x2.tutorials;

class A {
	public int id;
	A(int id) {
		this.id = id;
	}
}

public class Reference {

//	�⺻�������� ���� = Ex) ���纻 �����.
//	��°�� 1.
	public static void runValue() {
		int a = 1; //a�� 1�� ����.
		int b = a; //b�� a�� ����.
		b = 2; //b�� 2�� ����.
		System.out.println("runValue: " +a); // b�� ����2���� a�� ���� 1�̴�.
//		b��� ������ a�� ������ �� ���̱⿡ ���� �ٸ� ����. ��, b�� �ٲ۴ٰ� a�� �ٲ��� ����.  
	}
	
//	������������ ���� = Ex) �ٷΰ��� �����.
//	��°�� 2. 
	public static void runReference() {
		A a = new A(1); //new�� �̿��� ��ü�� �ν��Ͻ�ȭ ��Ŵ.(�Ű������� id�� 1�� �Է�.)
		A b = a; // b���� 
		b.id = 2; //b�� id���� 2�� �ٲ�. 
		System.out.println("runReference: " +a.id); // ����� 2�̴�.
//		b�� a�� �����ϴ°��� �ƴ� ����. ��, b��� ������ �����Ȱ� �ƴ� a�� �����ϴ� �����̱⿡ b�� �ٲٸ� a�� �ٲ�.  
	}
	
	public static void main(String[] args) {

		runValue();
		runReference();
		
	}

}
