package kang2x2.tutorials;

public class Ex3 {

	public static void main(String[] args) {
		
//		String student[] = {"강성혁", "지창환", "조대현", "황건희"};
//		
//		for(int i = 0; i < student.length; ++i) {	
//			int stay = student.length;
//			System.out.println("현재 대기중인 학생: " + (stay-(i + 1)));
//			System.out.println("현재 상담중인 학생: " + student[i]);
//			System.out.println("현재 상담받은 학생: " + (i + 1) +"\n");
//		}
		
	///////////////////////////////////////////
		
//		for each 사용
		String student[] = {"dkdk","강성혁", "지창환", "조대현", "황건희"};
		int i = 0;
		
		for(String var : student) {	
			int stay = student.length;
			System.out.println("현재 대기중인 학생: " + (stay-(i + 1)));
			System.out.println("현재 상담중인 학생: " + var);
			System.out.println("현재 상담받은 학생: " + (i + 1) +"\n");
			i++;
		}
		
	}

}
