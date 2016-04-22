package data;

import java.util.ArrayList;

public interface EmployeeDAO {
	public Employee getEmpByID(int id); 
	public ArrayList<ArrayList> getAllEmployees (String qry); 
		// TODO Auto-generated method stub
	public int addEmployee (String firstname, String lastname, String departmentId, String jobId, String address, String city, String state, String zipcode); 
	
	

}
