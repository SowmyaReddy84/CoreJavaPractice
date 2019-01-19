package questions;

import java.util.Scanner;

public class ArrayQuestion4 {
	public static void main(String[] args) {
		int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Array Size :");
		 n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter the array values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int large=arr[0];
		for(int i=0;i<n;i++) {
				if(arr[i]>large) {
					large=arr[i];	
				}	
		
		}
		int small=arr[0];
        for(int i=0;i<n;i++) {
				if(arr[i]<small) {
					small=arr[i];
			}
	   	}
		
		
		System.out.println("Largest number is "+large);	
		System.out.println("Smallest number is "+small);
		sc.close();
		
	}	
}
