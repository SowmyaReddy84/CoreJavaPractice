package controlflowstatements;

import java.util.Scanner;


public class SimpleIfStatement {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>=b) {
			System.out.println("a is greater");
			System.out.println("am in if block");
		}
		else {
			System.out.println("b is greater");
		}
		
		System.out.println("simple if done");
	
		
	}

}
