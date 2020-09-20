package kang2x2.tutorials;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//			Input Output
public class IO {
	
	public static void main(String[] args) {
//		파일을 불러와서 출력하기.
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt() * 10);
			}
			sc.close();
		}
			catch(FileNotFoundException e) {
				e.printStackTrace();
		}
		
		
		
//		키보드로 정수 입력 받아 출력하기.
//		1. 한번만 입력할 수 있게.
//		Scanner sca = new Scanner(System.in);
//		System.out.println(sca.nextInt() * 10);
//		sca.close();
//		2. 반복해서 입력 가능하게.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 10);
		}
		sc.close();
		System.out.println("수를 입력하지 않아 종료합니다.");
	}	
	
}
