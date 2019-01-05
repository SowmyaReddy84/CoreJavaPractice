package arrays;

import java.util.Scanner;

public class Examp2 {
	public static void main(String[] args) {
		 int n,i;
		 System.out.println("enter the value");
		
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter the array values");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to search");
		int searchElement=sc.nextInt();
		for(i=0;i<n;i++) {
			if(arr[i]==searchElement) {
				System.out.println(i+1+"element found at "+(i+1)+" location");
			}
			
		}
	}

}
