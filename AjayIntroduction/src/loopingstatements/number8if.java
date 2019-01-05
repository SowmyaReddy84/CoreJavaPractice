package loopingstatements;

import java.util.Scanner;

public class number8if {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n%5==0&&n%3==0) 
		{
			System.out.println("Number divisiable by 5 and 3");
		}
		else {
			System.out.println("not divisable by 3 or 5");
		}
	}
}
