package kang2x2.tutorials;

public class Ex3 {

	public static void main(String[] args) {
		
//		String student[] = {"������", "��âȯ", "������", "Ȳ����"};
//		
//		for(int i = 0; i < student.length; ++i) {	
//			int stay = student.length;
//			System.out.println("���� ������� �л�: " + (stay-(i + 1)));
//			System.out.println("���� ������� �л�: " + student[i]);
//			System.out.println("���� ������ �л�: " + (i + 1) +"\n");
//		}
		
	///////////////////////////////////////////
		
//		for each ���
		String student[] = {"dkdk","������", "��âȯ", "������", "Ȳ����"};
		int i = 0;
		
		for(String var : student) {	
			int stay = student.length;
			System.out.println("���� ������� �л�: " + (stay-(i + 1)));
			System.out.println("���� ������� �л�: " + var);
			System.out.println("���� ������ �л�: " + (i + 1) +"\n");
			i++;
		}
		
	}

}
