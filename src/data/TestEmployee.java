package data;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDBDAO(); 
		Employee emp = dao.getEmpByID(1123); 
		System.out.println(emp);
	}

}
