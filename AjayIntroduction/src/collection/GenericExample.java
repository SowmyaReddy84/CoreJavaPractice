package collection;

import java.util.*;

public class GenericExample {
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails(1,"abc");
		StudentDetails sd1=new StudentDetails(2,"xyz");
		ArrayList<StudentDetails> al=new ArrayList<StudentDetails>();
		al.add(sd);
		al.add(sd1);
		for(StudentDetails s:al) {
			System.out.println(s);
		}
		System.out.println("using iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
