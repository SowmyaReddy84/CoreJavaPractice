package inheritance;


class ParentClass{
	
	ParentClass()
	{
		System.out.println("Default parent constructor");
	}
ParentClass(int a,int b){
		System.out.println("parameterized Constructors is invoking "+(a+b));
	}
}
class ChildClass extends ParentClass
{
	ChildClass(int x,int y){
		super(55,85);
		System.out.println("parameterized constructor in child class");
	}
	ChildClass(){
		this(10,20);
	
		System.out.println("Default Child construcot");
	}
}




public class ConExamp {

	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
	}
	
}
