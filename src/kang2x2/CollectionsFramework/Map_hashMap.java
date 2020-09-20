package kang2x2.CollectionsFramework;

import java.util.Collections;
import java.util.HashMap;

public class Map_hashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("나이", 27);
		hm.put("번호", 27);
		hm.put("번호", 25);
		
		System.out.println(hm.get("나이"));
		System.out.println(hm.get("번호"));
	}

}
