package oopsConcept;
class  ChainingConstructors{
	ChainingConstructors(){
		this("abc");
		
		System.out.println("default constructor");
	}
	ChainingConstructors(int x,int y){
		System.out.println("default constructor"+(x+y));
	}
	ChainingConstructors(String str){
		this(10,25);
		System.out.println("default constructor"+str);
		
	}
	
}
public class ConstructorChaining {
	public static void main(String[] args) {
		ChainingConstructors ch=new ChainingConstructors();
		
	}

}
