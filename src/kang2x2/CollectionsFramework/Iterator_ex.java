package kang2x2.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_ex {

	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		System.out.println(A);
		
		Iterator hi = A.iterator(); //A�� �����ϰ� �ִ�  �������? hi�� ����.
		while(hi.hasNext()) { //hi�� ���� ���� ���������� �ݺ�
			System.out.println(hi.next()); //hi�� �������� �ϳ��� ������?  
		}
		
	}

}
