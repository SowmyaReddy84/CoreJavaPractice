package arrays;

import java.util.Scanner;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int m,n;
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("entered array elements are");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
}
