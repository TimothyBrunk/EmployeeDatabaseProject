package data;

import java.util.ArrayList;

public interface EmployeeDAO {
	public Employee getEmpByID(int id); 
	public ArrayList<ArrayList> getAllEmployees (String qry); 
		// TODO Auto-generated method stub
	public int addEmployee (Employee e); 
	public Employee deleteEmployee(int id); 
	public int updateEmployee(Employee e); 
}
