package exceptionajay;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
//		if(b==0) {
//			System.out.println("enter the value properly");
//			
//		}
//		else {
//			System.out.println("result is"+(a/b));
//		}
//		System.out.println("exception handled ");
		
		try {
			c=a/b;
			System.out.println("exceptionis handling");
			throw new ArithmeticException();
		}
		catch(ArithmeticException ae) {
			System.out.println("arithmetic exception");
			System.out.println(ae.getMessage());
		}
		
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("try block execution is done");
		}
	}

}
