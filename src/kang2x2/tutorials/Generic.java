package kang2x2.tutorials;

class StudentInfo {
	public int grade; 
	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class Person <T>{
	public T info;
	Person(T info) {
		this.info = info;
	}
}

public class Generic {

	public static void main(String[] args) {
		Person<StudentInfo> p1 = new Person(2);
		System.out.println(p1.info);
	}

}
