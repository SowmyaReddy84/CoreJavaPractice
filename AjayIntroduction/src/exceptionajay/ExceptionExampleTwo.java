package exceptionajay;
class ExampleException{
	int divide(int a,int b){
		if(b==0) {
			throw new ArithmeticException("divide byzero is not possibel");
		}
		else {
			return a/b;
		}
	}
}
public class ExceptionExampleTwo {
	public static void  main(String[] args) {
//		String s=null;
//		
//		System.out.println("character at index 1 is "+s.charAt(2));
		int arr[]= {25,36,2,85,96};
    	System.out.println(arr[5]);
		int res;
		
		ExampleException ee=new ExampleException();
		try {
			res=ee.divide(10, 0);
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("exception");
			System.out.println(e.getMessage());
		}
		
		
	}

}
