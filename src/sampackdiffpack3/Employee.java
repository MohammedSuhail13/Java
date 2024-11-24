package sampackdiffpack3;
import com.samepackdiffpack.Student;
import com.samepackagediffpackage2.College;
public class Employee {
	
	private void empName() {
		System.out.println("Employee Name = Mohammed Suhail");
	}
	private void empID() {
		System.out.println("Employee ID = 7676");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.stdName();
		s.stdLocation();
		
		College c = new College();
		c.clgName();
		c.clgLocation();
		
		Employee e = new Employee();
		e.empName();
		e.empID();
	}

}
