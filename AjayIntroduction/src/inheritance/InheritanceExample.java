package inheritance;

class Test{
	int value=25;
	public void method1() {
		System.out.println("method1 in parent class");
	}
	void method3() {
		System.out.println("method3 in parent class which is private method");
	}
	protected void method2() {
		method3();
		System.out.println("method2 in parent class which is protected method");	
	}
	
}
class Test2 extends Test{
	public void ChildMethod() {
		System.out.println("method in child class");
	}
	
	
}
class Test3 extends Test{
	public void method4() {
		System.out.println("method3 in Test3 class");
	}
	
}
public class InheritanceExample {
	public static void main(String[] args) {
		Test3 t2=new Test3();
		t2.method1();
		t2.method3();
		t2.method2();
		System.out.println(t2.value);
	}

}
