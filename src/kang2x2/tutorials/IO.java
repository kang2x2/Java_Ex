package kang2x2.tutorials;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//			Input Output
public class IO {
	
	public static void main(String[] args) {
//		������ �ҷ��ͼ� ����ϱ�.
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
		
		
		
//		Ű����� ���� �Է� �޾� ����ϱ�.
//		1. �ѹ��� �Է��� �� �ְ�.
//		Scanner sca = new Scanner(System.in);
//		System.out.println(sca.nextInt() * 10);
//		sca.close();
//		2. �ݺ��ؼ� �Է� �����ϰ�.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 10);
		}
		sc.close();
		System.out.println("���� �Է����� �ʾ� �����մϴ�.");
	}	
	
}
