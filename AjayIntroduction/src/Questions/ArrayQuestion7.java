package questions;

import java.util.Scanner;

public class ArrayQuestion7 {
		//total negative numbers in array
public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 5 Digits");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int pos=0,neg=0;
		for(int i=0;i<5;i++) {
			if(a[i]>=0) {
				pos++;
			}
			else {
				neg++;
			}
		}
		System.out.println("total negative number are "+neg);
}
}
