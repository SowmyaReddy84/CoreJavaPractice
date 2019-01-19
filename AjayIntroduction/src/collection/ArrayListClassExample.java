package collection;

import java.util.ArrayList;
import java.util.Iterator;

class StudentDetails{
	int sid;
	String sname;
	public StudentDetails(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
//	public String toString() {
//		return sid+" "+sname;
//	}
	
}
public class ArrayListClassExample {
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails(1,"abc");
		StudentDetails sd1=new StudentDetails(2,"xyz");
		ArrayList al=new ArrayList() ;
		al.add(sd);
		al.add(sd1);
		System.out.println("getting element with toString");
		System.out.println(al);
		System.out.println("getting element with Iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		StudentDetails s=(StudentDetails)itr.next();
			System.out.println(s.sid+s.sname);
		}

		
	}
	
}
