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
		
		Iterator hi = A.iterator(); //A를 참조하고 있는  가상공간? hi를 생성.
		while(hi.hasNext()) { //hi의 다음 값이 있을때까지 반복
			System.out.println(hi.next()); //hi의 다음값을 하나씩 가져옴?  
		}
		
	}

}
