package abstraction;

abstract class AbstractClass{
	final int a=90;
	
	abstract void methodShow();
	
	void methodNormal() {
		System.out.println("method normal");
	}
	AbstractClass(){
		System.out.println("default constructor");
	}
	static void methodStatic() {
		System.out.println("static method");
	}
}
class ExampleAbstract extends AbstractClass{

	
	void methodShow() {
		System.out.println("abstract method is overrided");
	}
	
}
public class AbstractClassExample {
	public static void main(String[] args) {
		AbstractClass ac=new ExampleAbstract();
		ac.methodShow();
		AbstractClass.methodStatic();
	}

}
