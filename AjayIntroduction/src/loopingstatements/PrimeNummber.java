package loopingstatements;

import java.util.Scanner;

public class PrimeNummber {
	public static void main(String[] args) {
		int num,i;
		 boolean res=false;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num;i++) {
			if(num%i==0) {
				res=true;
				break;
				
			}
			
		}
		
		if(res) {
			System.out.println("not A PRIME NUMBER");
		}
		else {
			System.out.println("prime number");
		}
}
}