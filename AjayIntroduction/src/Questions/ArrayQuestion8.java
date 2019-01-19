package questions;

import java.util.Scanner;

public class ArrayQuestion8 {
	//Copy array elements to another
public static void main(String[] args) {
		
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 5 Digits");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
}
}
