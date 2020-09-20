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
		
//		A.addAll(B); //B의 모든 값을 A에 합친다.  
//		System.out.println(A);
//		A.retainAll(B); //A와 B값중 중복되는 값만 A에 담는다. 
//		System.out.println(A);
//		A.removeAll(B);
//		System.out.println(A); //A에서 B를 모두 제외한다.(중복되는 숫자도)
		
		System.out.println(A.contains(3));
		System.out.println(A.contains(C));		
		System.out.println(A.containsAll(B)); //B는 A의 부분집합이 아니기에 false 
		System.out.println(A.containsAll(C)); //C는 A의 부분집합이기에 true

	}


}
