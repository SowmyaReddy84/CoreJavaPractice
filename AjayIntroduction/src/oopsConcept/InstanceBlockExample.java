package oopsConcept;
class ExampleInstance{
	void method1() {
		System.out.println("method1");
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("stattic block");
	}
	ExampleInstance(){
//		 void method2(){
//			System.out.println("method ");
//		}
		System.out.println("default constructor");
		
	}
}
public class InstanceBlockExample {
	public static void main(String[] args) {

		ExampleInstance ei=new ExampleInstance();
		ExampleInstance ei1=new ExampleInstance();
		
		
	}

}
