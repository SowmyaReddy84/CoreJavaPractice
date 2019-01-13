package abstraction;

import java.util.Scanner;

class Student{
	private int studentId;	
	private String studentName;
	private int studentAge;
	private String password;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Student st=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enterv the values");
		int sid=sc.nextInt();
		String sname=sc.next();
		int age=sc.nextInt();
		String password=sc.next();
		
		st.setPassword(password);
		st.setStudentAge(age);
		st.setStudentId(sid);
		st.setStudentName(sname);
		
		EmployeeImplementation ei=new EmployeeImplementation();
		ei.displayStudentInfo(st);
		ei.validateStudent(st);
		
		
			
	
	
	}

}
