package arrays;

import java.util.Scanner;

public class SecondLargest {
	
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
		
		int largest=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(arr[i]>arr[j]) {
					largest=arr[i];	
				}	
			}
		}
		
		System.out.println(largest);

}
}
