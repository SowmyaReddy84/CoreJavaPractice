package questions;

import java.util.Scanner;

public class ArrayQuestion3 {
	
	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of the entered elements is: "+sum);
	}

}
