package kang2x2.CollectionsFramework;

import java.util.ArrayList;

public class ArrayList_ex {

	public static void main(String[] args) {
//		일반방법
		int[] ary = new int[2];
		ary[0] = 0;
		ary[1] = 1;
		
		for(int i = 0; i < ary.length; ++i) {
			System.out.println(ary[i]);			
		}
		
//		ArrayList를 사용
		ArrayList<String> aryList = new ArrayList<String>(); //제네릭을 사용한 형변환. 
		aryList.add("하나");
		aryList.add("둘");
		
		System.out.println("\nArrayList");
		
		for(int i = 0; i < aryList.size(); ++i) {
			String str = aryList.get(i); //ArrayList의 데이터형은 object라 String로 형변환 필요.
			System.out.println(str);
		}
	}

}
