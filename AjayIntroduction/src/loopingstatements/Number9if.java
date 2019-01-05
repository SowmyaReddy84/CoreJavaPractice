package loopingstatements;
import java.util.*;

public class Number9if {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(b*b)-(4*a*c);
		if(d==0) {
			System.out.println("roots are "+(-b/(2*a)));
		}
		else if(d>0) {
			double root1=(-b+(Math.sqrt(d)))/(2*a);
			double root2=(-b-(Math.sqrt(d)))/(2*a);
			System.out.println("roots are "+root1+" "+root2);
		}
		else {
			System.out.println("roots are imaginary");
		}
	}
}
