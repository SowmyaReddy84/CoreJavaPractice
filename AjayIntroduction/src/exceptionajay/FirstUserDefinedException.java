package exceptionajay;

import java.util.Scanner;

class MyException extends Exception{
String txt;
MyException(String txt){
	super(txt);
	System.out.println(txt);
	System.out.println("User Defined Exception Class");
}
}
class method1{
	int divide1(int a,int b) throws MyException
	{
		if(b==0) {
			throw new MyException("by Zero Not Possible");
		}
		return a/b;	
	}
	void searcharray(int a[],int b)throws MyException {
		for(int i=0;i<5;i++) {
			if(a[i]==b) {
			    System.out.println("Number found at"+(i+1)+"is"+a[i]);
			}
			else {
				throw new MyException("Array index out of bound");
			}
		}	
	}
}


public class FirstUserDefinedException {
	
	public static void main(String[] args)   {
		int a,b,c;
		int z[]=new int[5];
		Scanner sc=new Scanner(System.in);
		method1 m1=new method1();
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter 5 Digits:");
		for(int i=0;i<5;i++) {
			z[i]=sc.nextInt();
		}
		try {
			c=m1.divide1(a,b);	
			System.out.println("Add number to be searched from Array");
			int ser=sc.nextInt();
			m1.searcharray(z,ser);
			
		}
		catch(MyException me) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}

