package polymorphism;

import java.util.Scanner;

class Employee{
	private int empid;
	
	private String empName;
	private int eAge;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		int eid=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		
		
		e.setEmpid(eid);
		e.seteAge(age);
		e.setEmpName(name);
		System.out.println(e.getEmpName()+" "+e.geteAge()+" "+e.getEmpid());
	}
	

}
