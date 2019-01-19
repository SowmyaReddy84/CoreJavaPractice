package exception;

import java.util.Scanner;

class UserDefinedArithmeticException extends Exception{
	String msg;
	UserDefinedArithmeticException(String msg){
		super(msg);
		System.out.println("am in UserDefinedArithmeticException class");
		System.out.println(msg);
	}
	
}
class UserException{
	int computeDivison(int x,int y) throws UserDefinedArithmeticException {
		if(y==0) {
			System.out.println("am in if block");
			throw new UserDefinedArithmeticException("division by zero is not possible");
		}
		return x/y;
	}
	
}
public class UserDefineException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z;
		UserException ue=new UserException();
		try {
			System.out.println("am in try block");
			z=ue.computeDivison(a,b);
		}
	catch(UserDefinedArithmeticException ude){
		System.out.println("am in catch block");
			System.out.println("catch block mesage"+ude.getMessage());
		}
	}

}
