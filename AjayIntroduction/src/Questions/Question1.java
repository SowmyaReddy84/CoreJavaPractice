package questions;

public class Question1 implements Interface1 {

	public void display(Class2 c2) {
		// TODO Auto-generated method stub
		System.out.println(c2.getUsername()); 
		System.out.println(c2.getPwd()); 	
		
	}

	@Override
	public void validate(Class2 c2) {
		// TODO Auto-generated method stub
		if(c2.getPwd()=="Hello") {
			System.out.println("Password is correct");
		}
		else {
			System.out.println("Password is wrong");
		}
		
		
	}
	
}
