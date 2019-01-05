package loopingstatements;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n,rev,res,temp;
		rev=0;
		Scanner sc=new Scanner(System.in);
		//num=121
		n=sc.nextInt();
		temp=n;
		while(n!=0) {
			res=n%10;
			rev=rev*10+res;
			n=n/10;
		}
		System.out.println("reverse numbre is "+rev+" "+n+" "+temp);
		if(rev==temp) {
			System.out.println("it is palindrome number");
		}
		else {
			System.out.println("it is  not a palindrome number");
		}
		
	}

}
