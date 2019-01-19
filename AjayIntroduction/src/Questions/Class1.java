package questions;

import java.util.Scanner;

class Class2{

	Scanner sc= new Scanner(System.in);
	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.print("Enter Username: ");
		username=sc.next();
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		System.out.print("Enter Password: ");
		pwd=sc.next();
		this.pwd = pwd;
	}
	
}

public class Class1{
	public static void main(String[] args) {
		Class2 c2=new Class2();
		String username = null;
		c2.setUsername(username);
		String pwd=null;
		c2.setPwd(pwd);
		Question1 q1= new Question1();
		q1.display(c2);
		q1.validate(c2);
		
		
	}
	
}
