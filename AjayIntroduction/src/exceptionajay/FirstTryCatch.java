package exceptionajay;

import java.util.Scanner;

public class FirstTryCatch { 
	
	public static void main(String[] args) {
		int a,b,c;
		String s=null;
		int z[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to divide");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter 5 digits");
		for(int i=0;i<5;i++) {
			z[i]=sc.nextInt();
		}
		try {
			c=a/b;
			System.out.println("Enter the index to be searched");
			int o;
			o=sc.nextInt();
			int x=z[o];
			char ch=s.charAt(5);
			throw new ArrayIndexOutOfBoundsException("Array Out of Bound Error");
		}
		
	    catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
		System.out.println("Arithmetic Catch block");		}
		
		catch(ArrayIndexOutOfBoundsException aio) {
		aio.getMessage();
		System.out.println("AIO catch block");
		}
		catch(Exception e) {
			System.out.println("Default Exception");
			e.getMessage();
			e.printStackTrace();
		}
		finally {
			System.out.println("Hello, working even after an Exception");
		}
		
	}

}
