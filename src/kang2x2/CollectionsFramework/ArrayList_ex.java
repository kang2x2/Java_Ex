package kang2x2.CollectionsFramework;

import java.util.ArrayList;

public class ArrayList_ex {

	public static void main(String[] args) {
//		�Ϲݹ��
		int[] ary = new int[2];
		ary[0] = 0;
		ary[1] = 1;
		
		for(int i = 0; i < ary.length; ++i) {
			System.out.println(ary[i]);			
		}
		
//		ArrayList�� ���
		ArrayList<String> aryList = new ArrayList<String>(); //���׸��� ����� ����ȯ. 
		aryList.add("�ϳ�");
		aryList.add("��");
		
		System.out.println("\nArrayList");
		
		for(int i = 0; i < aryList.size(); ++i) {
			String str = aryList.get(i); //ArrayList�� ���������� object�� String�� ����ȯ �ʿ�.
			System.out.println(str);
		}
	}

}
