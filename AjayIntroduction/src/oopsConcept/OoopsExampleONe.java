package oopsConcept;

class OopsExample{
	static int a=55;//instance Varible
	//static int res;
	void method1() {
		int b=20;//local variable
		int a=35;
		System.out.println("local varaibles are accessing"+(a+b));
		System.out.println(a+b);//this is used to call the current class variables and constructors
	
		
	}
	void incrementingAValue() {
		a++;
		System.out.println("value of a is "+a);
	}
	void methodToAccessB() {
		System.out.println(a);
	}
}
public class OoopsExampleONe {
//	  static void methodShow() {
//		  methodDisplay();
//		System.out.println("this is show method");
//	}
//	  static void methodDisplay() {
//		  System.out.println("this is display  method");
//	  }
	public static void main(String[] args) {
		OopsExample oe=new OopsExample();
		OopsExample oe1=new OopsExample();
		OopsExample oe2=new OopsExample();
		oe.method1();
		oe.methodToAccessB();
		oe.incrementingAValue();
		oe1.incrementingAValue();
		oe2.incrementingAValue();
		
	}

}
