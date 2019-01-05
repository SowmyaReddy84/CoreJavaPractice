package arrays;

import java.util.Scanner;

public class Examp {
	
 public static void main(String[] args) {
	 int n,i;
	 System.out.println("enter the value");
	
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 int even[]=new int[n];
	 int odd[]=new int[n];
	int evenSize=0;
	int oddSize=0;
	 System.out.println("enter the array values");
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("entered array elements are");
	for(i=0;i<n;i++) {
		if(arr[i]%2==0) {
			//int j=0;
			even[evenSize]=arr[i];
			evenSize++;
		}
		else {
		odd[oddSize]=arr[i];
		oddSize++;
		}
	}
	System.out.println("Even number");
	for(i=0;i<evenSize;i++) {
		System.out.println(even[i]);
	}
	System.out.println("odd number");
	for(i=0;i<oddSize;i++) {
		System.out.println(odd[i]);
	}
	 
	 
 	}

}
