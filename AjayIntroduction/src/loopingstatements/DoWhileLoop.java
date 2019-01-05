package loopingstatements;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int n,i=1;
		char ch='y';
		Scanner sc=new Scanner(System.in);
		//num=121
		n=sc.nextInt();
		
		do {
			System.out.println("Accoutinforma");
			ch=sc.next().charAt(0);
			
		}
		while(ch!='n');
	}

}
