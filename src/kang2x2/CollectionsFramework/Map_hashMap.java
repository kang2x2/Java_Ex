package kang2x2.CollectionsFramework;

import java.util.Collections;
import java.util.HashMap;

public class Map_hashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("����", 27);
		hm.put("��ȣ", 27);
		hm.put("��ȣ", 25);
		
		System.out.println(hm.get("����"));
		System.out.println(hm.get("��ȣ"));
	}

}
