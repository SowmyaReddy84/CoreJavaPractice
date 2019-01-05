package loopingstatements;

import java.util.Scanner;

public class Number6if {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int year;
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}
}
