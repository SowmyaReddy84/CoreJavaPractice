package loopingstatements;

import java.util.Scanner;

public class Ifelse {
	
	public static void main(String[] args) {
		int math,bio,chem,phy,comp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Math score: ");
		math=sc.nextInt();
		System.out.print("Enter the Biology score: ");
		bio=sc.nextInt();
		System.out.print("Enter the Chemistry score: ");
		chem=sc.nextInt();
		System.out.print("Enter the Physics score: ");
		phy=sc.nextInt();
		System.out.print("Enter the Computer score: ");
		comp=sc.nextInt();
		int tm = comp+phy+chem+bio+math;
		int percen=tm/5;
		System.out.println(percen);
		if(percen>=90) {
			System.out.print("You've Scored A grade");
		}
		else if(percen>=80) {
			System.out.print("You've Scored B grade");
		}
		else if(percen>=70) {
			System.out.print("You've Scored C grade");
		}
		else if(percen>=60) {
			System.out.print("You've Scored D grade");
		}
		else if(percen>=40) {
			System.out.print("You've Scored E grade");
		}
		else if(percen<40) {
			System.out.print("You've Scored F grade");
		}
	}

}
