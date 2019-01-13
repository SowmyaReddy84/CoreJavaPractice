package abstraction;

public class EmployeeImplementation implements EmployeeInterface{



	@Override
	public void displayStudentInfo(Student student) {
		System.out.println("Student Details are:");
		System.out.println(student.getPassword());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
		System.out.println(student.getStudentId());
	}

	@Override
	public void validateStudent(Student student) {
		
		if(student.getStudentName()=="abc"&&student.getPassword()=="abc@123") {
			System.out.println("student is valid");
		}
		else {
			System.out.println("student is not valid");
		}
	}

}
