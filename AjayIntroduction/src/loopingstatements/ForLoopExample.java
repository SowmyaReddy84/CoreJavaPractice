package loopingstatements;

import java.util.Scanner;

public class ForLoopExample {
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		n=sc.nextInt();
		for(i=1;i<=2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(i+" "+j);
			}
			
		}
	}

}
