package polymorphism;

class StaticPolymorphism{
	void sum() {
		System.out.println("this is sum method");
	}
	void sum(int a,int b) {
		System.out.println("the sum of two numbers is "+(a+b));
	}
	int sum(int a) {
		return a;
	}
	
}
public class OverLoading {

	public static void main(String[] args) {
		StaticPolymorphism sp=new StaticPolymorphism();
		sp.sum();
		sp.sum(10,20);
		int res=sp.sum(55);
		System.out.println(res);
	
		
	}

}
