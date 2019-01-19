package polymorphism;

class StaticPolymorphism{
	void display() {
		System.out.println("display method ");
	}
	int display(int a,int b) {
		System.out.println("display method with int return type");
		return a+b;
	}
	String display(String str,String str1) {
		System.out.println("display method woth string return type");
		return str1+str;
	}
	
	
}
public class OverLoading {

	public static void main(String[] args) {
		StaticPolymorphism sp=new StaticPolymorphism();
		sp.display();
		int res=sp.display(10,20);
		System.out.println("result is "+res);
		System.out.println(sp.display("sowmya", "reddy"));
		
	
		
	}

}
