package arrays;

import java.util.Scanner;

public class LargestArray {
	
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
		int large=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(arr[i]>arr[j]) {
					large=arr[i];	
				}	
		}
		}
		int small=0;
         for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					small=arr[i];
				}
			}
	   	}
		
		
		System.out.println("Largest number is "+large);	
		System.out.println("Smallest number is "+small);
		sc.close();
	}

}
