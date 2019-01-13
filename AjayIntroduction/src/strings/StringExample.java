package strings;
class ExampleStrings{
	String s1="sowmya";
	String s2="sowmya";
	
	String str1=new String("sowmya");
	String str2=new String("SOWMYA");
	 void method1() {
//System.out.println("s1 equals s2"+s1.equals(s2));
//		System.out.println("s1==s2"+(s1==s2));
		 System.out.println(str1.equals(str2));
//	System.out.println(str1==str2);
//	System.out.println(str1.charAt(0));
//	System.out.println("string is"+str1+"string after");
	System.out.println("length is "+str1.length());
//	System.out.println("trim function"+str1.trim());
//	System.out.println("string is"+str1+"string after");
//
//	System.out.println("length is "+str1.length());
		 System.out.println(10+20+"string"+(10+20));
		 System.out.println(str1.concat(str2));
		 System.out.println(str1.startsWith("sow"));
		 System.out.println(str1.equalsIgnoreCase(str2));
		 System.out.println(str1.substring(2));
		 System.out.println(str1.substring(2, 4));
		 System.out.println(str1.contains("swo"));
	

	}
}
public class StringExample {
	public static void main(String[] args) {
		ExampleStrings es=new ExampleStrings();
		es.method1();
	}

}
