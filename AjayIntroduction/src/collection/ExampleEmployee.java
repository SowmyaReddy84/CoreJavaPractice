package collection;

class EmployeeDetails{
	private int eid;
	private String ename;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String toString() {
		System.out.println("we are in toString method");
		return " employee id is "+eid+" employee name is"+ename;
	}
	
}
public class ExampleEmployee {
	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		ed.setEid(12);
		ed.setEname("abc");
		//System.out.println("object info"+ed);
		System.out.println(ed.getEname()+" "+ed.getEid());

	}

}
