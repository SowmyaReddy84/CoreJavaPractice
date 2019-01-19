package questions;

import java.util.Scanner;

public class ArrayQuestion6 {
	
	public static void main(String[] args) {
		
		int a[]=new int[8];
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 8 Digits");
		for(int i=0;i<8;i++) {
			a[i]=sc.nextInt();
		}
		int even=0,odd=0;
		for(int i=0;i<8;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Total number of odd elements are: "+odd);
		System.out.println("Total number of even elements are: "+even);
	}

}
