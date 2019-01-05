package oopsConcept;
class ExampleConstructors{
	ExampleConstructors(){
		System.out.println("default Constructors");
	}
	ExampleConstructors(int a){
		System.out.println("parameterized constructor"+a);
	}
	ExampleConstructors(int a,int b){
		System.out.println("Name is "+a+b);
	}
	
	
}
public class ConstructorsExample {
	public static void main(String[] args) {
		ExampleConstructors ec=new ExampleConstructors();
		ExampleConstructors ec1=new ExampleConstructors(10);
		ExampleConstructors ec2=new ExampleConstructors(10,20);
	}

}
