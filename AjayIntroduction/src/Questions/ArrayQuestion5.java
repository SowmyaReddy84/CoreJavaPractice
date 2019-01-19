package questions;

import java.util.Scanner;

public class ArrayQuestion5 {
	
	public static void main(String[] args) {
		int a[]=new int[5];
		int b,i,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 Digits:");
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Seconf Largest Number is: ");
//		int largest=a[0],second;
//		for(i=0;i<5;i++) {
//			if(a[i]>largest) {
//				largest=a[i];
//			}	
//		}
//		if(a[0]!=largest) {
//		second=a[0];}
//		else {
//			second=a[1];
//		}
//		for(i=0;i<5;i++) {
//			if(a[i]!=largest) {
//				if(a[i]>second){
//					second=a[i];
//				}
//			}
//		}
//		System.out.print(second);
		int larg1=a[0];
		int larg2=a[1];
		int temp;
		if(larg2>=larg1) {
			temp=larg1;
			larg1=larg2;
			larg2=temp;
		}
		for(i=2;i<5;i++) {
			if(a[i]>=larg1) {
				larg2=larg1;
				larg1=a[i];
				
			}
			else if(a[i]>=larg2) {
				larg2=a[i];
			}
		}
		System.out.println(larg2);
		
	}

}
