package Interivew;

public class qq39 {
	public static void main(String args []) {
		Student stud = new Student(10);
		Student stud1 = new Student(35);
		change(stud);
		System.out.println(stud.sid);
	}
	static void change(Student stud) {
		stud.sid = stud.sid+10;
	}

}
class Student {
	static int sid;
	Student(int sid) {
		this.sid = sid;
	}
	
}
