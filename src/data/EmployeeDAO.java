package data;

import java.util.ArrayList;

public interface EmployeeDAO {
	public Employee getEmpByID(int id); 
	public ArrayList<ArrayList> getAllEmployees (String qry); 
		// TODO Auto-generated method stub
	public int addEmployee (Employee e); 
	public int deleteEmployee(Employee e); 
	public int updateEmployee(Employee e); 
	public Employee getEmpByName(String firstname, String lastname); 
	
}
