package loopingstatements;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
	}
}
