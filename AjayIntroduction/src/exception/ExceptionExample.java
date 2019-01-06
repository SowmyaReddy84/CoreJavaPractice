package exception;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z;
		System.out.println("divding a value with b");
		/*System.out.println(a/b);
		System.out.println("completed dividing the values");
		*/
		/*int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.println("array va;ues are prnted successfully");
		}*/
		/*try {
			z=a/b;
			System.out.println("result is "+a/b);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("exception message is printing");
			e.printStackTrace();
		}
		finally {
			System.out.println("am in finally block");
		}*/
		try {
			z=a/b;
			
		}
		catch(ArithmeticException ae) {
			System.out.println("edvkfkshj");
			ae.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("exception message is printing");
			e.printStackTrace();
		}
		
		
		
		
	}

}
