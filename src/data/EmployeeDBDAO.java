package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDBDAO implements EmployeeDAO {
    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/companydb";

	@Override
	public Employee getEmpByID(int id) {
		Employee emp = null; 
		String sql = "select id,firstname, middlename, lastname, email from employees where id =" +id; 
		
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement(); 
			ResultSet rs = statement.executeQuery(sql); 
			while (rs.next()) { 
				String eid = rs.getString(1);
				String firstName = rs.getString(2); 
				String middlename = rs.getString(3); 
				String lastName = rs.getString(4); 
				String email = rs.getString(5); 
				emp = new Employee(eid, firstName,middlename,lastName, email); 
			}
			
			
			rs.close(); 
			statement.close(); 
			conn.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return emp;
	}

}
