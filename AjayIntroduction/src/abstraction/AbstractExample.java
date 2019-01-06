package abstraction;
abstract class ExampleAbstract{
	 int a;
	abstract void show();
	void display() {
		System.out.println("this is display method");
	}
}
class AbstractExampleTwo extends ExampleAbstract{

	@Override
	void show() {
	System.out.println("show method after implementig");
		
	}


	
}
public class AbstractExample {
	public static void main(String[] args) {
		AbstractExampleTwo aet=new AbstractExampleTwo();
		aet.display();
		aet.show();
	}

}
