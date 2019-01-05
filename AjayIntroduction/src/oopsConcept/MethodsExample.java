package oopsConcept;

import java.util.Scanner;

class ExampleMethods{
//returnType methodName(parameter List)
	public void showMethod(int eAge, String eName, float eSalary) { 
	System.out.println("Employee DEtails are: ");
	System.out.println("Employee Name:"+eName);
	System.out.println("Employee Age and Salary is "+eAge+" "+eSalary);
		// TODO Auto-generated method stub
		
	}

	public int  calculateTotalSalary(float eSalary) {
		int  totalSalary=(int)eSalary+10000;
		
		return totalSalary;
	}

	public char ageStatus(int eAge) {
		// TODO Auto-generated method stub
		return 'y';
	}
	
}
public class MethodsExample {
	public static void main(String[] args) {
		ExampleMethods em=new ExampleMethods();
		int eAge;
		float eSalary;
		String eName;
		Scanner sc=new Scanner(System.in);
		eAge=sc.nextInt();
		eName=sc.next();
		eSalary=sc.nextFloat();
		
		
		em.showMethod(eAge,eName,eSalary);
	int totalSalary=em.calculateTotalSalary(eSalary) ;
	System.out.println("result value is "+totalSalary);
	int  status=em.ageStatus(eAge);
	System.out.println(status);
	
	
	}

	

}
