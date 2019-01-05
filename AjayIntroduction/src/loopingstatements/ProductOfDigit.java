package loopingstatements;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String[] agrs) {
		int i,a,sum = 0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<=a;i++) {
		    if(i%2==0) {
		    	sum=sum+i;
		    }
		    }
		System.out.println("Sum of Even Number "+sum);
		}
}
