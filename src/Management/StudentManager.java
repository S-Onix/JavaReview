package Management;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList <Student> students = new ArrayList<>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.addStudent("가", 22, 20123512, "컴공과");
		manager.addStudent("나", 24, 20121512, "수학과");
		manager.addStudent("다", 27, 20153512, "무역과");
		manager.addStudent("라", 21, 20983512, "체육과");
		manager.addStudent("마", 25, 11123512, "무용과");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		
	}
	
	public void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " : 학생 정보 입력 성공!");
		
	}
}
