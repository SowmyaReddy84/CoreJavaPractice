package collection;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List al=new ArrayList();
		System.out.println("checking size"+al.size()+" checking for empty"+al.isEmpty());
		
		al.add("abc");
		
		al.add(235.65);
		al.add('c');
		al.add("2");
		al.add(1,"xyz");
		al.add(3,3);
		al.removeAll(al);
		ArrayList al2=new ArrayList();
		al2.add("pqr");
		al2.add(34);
		al2.addAll(al);
		
		System.out.println(" after adding checking size"+al.size()+" checking for empty"+al.isEmpty());
		System.out.println("getting element with toString");
		System.out.println(al);
		System.out.println("getting elements with for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("getting elements with the help of iterator");
		Iterator itr=al2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
