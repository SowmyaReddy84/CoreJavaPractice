package controlflowstatements;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println("character is "+ch);
		switch(ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'i':
			System.out.println("it is vowel");
			break;
		default:
			System.out.println("it is not a vowel");
			
		}
	}

}
