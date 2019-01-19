package polymorphism;
class Parent{
	protected   void method1() {
		System.out.println("method1 in parent class");
	}
}
class Child extends Parent{
	void method2() {
		System.out.println("method Two in class Child");
	}
	 protected void method1() {
		System.out.println("method1 in child class");
	}
	
}
class GrandChild extends Parent{
	void method() {
		System.out.println("method Two in class GrandChild");
	}
	public void method1() {
		System.out.println("method in GeandChild class");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Parent p=new Parent();
	
		Child c=new Child();
		
		GrandChild gc=new GrandChild();
		
		Parent par;
		
		par=p;
		par.method1();
		par=c;
		par.method1();
		
		
		
		 
		 
	}

}
