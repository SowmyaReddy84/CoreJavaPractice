package controlflowstatements;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		int a,b;
		System.out.println(" enter the values");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a!=b) {
			System.out.println("both are not equal");
			if(a>=b) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("b is greater");
			}
		}
		else {
			System.out.println("both are equal");
		}
		
	}

}
