package kang2x2.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ex {
	
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		B.add(6);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
//		A.addAll(B); //B�� ��� ���� A�� ��ģ��.  
//		System.out.println(A);
//		A.retainAll(B); //A�� B���� �ߺ��Ǵ� ���� A�� ��´�. 
//		System.out.println(A);
//		A.removeAll(B);
//		System.out.println(A); //A���� B�� ��� �����Ѵ�.(�ߺ��Ǵ� ���ڵ�)
		
		System.out.println(A.contains(3));
		System.out.println(A.contains(C));		
		System.out.println(A.containsAll(B)); //B�� A�� �κ������� �ƴϱ⿡ false 
		System.out.println(A.containsAll(C)); //C�� A�� �κ������̱⿡ true

	}


}
