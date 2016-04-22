package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDBDAO implements EmployeeDAO {
    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/companydb";

	@Override
	public Employee getEmpByID(int id) {
		Employee emp = null; 
		String sql = "select id,firstname, middlename, lastname, email, gender, hiredate, "
				+ " salary, department_id, job_id, address, city, state, zipcode from employees where id =" + id; 
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement(); 
			ResultSet rs = statement.executeQuery(sql); 
			while (rs.next()) { 
				String eid = rs.getString(1);
				String firstName = rs.getString(2); 
//				String middleName = rs.getString(3); 
				String lastName = rs.getString(4); 
//				String email = rs.getString(5); 
//				String gender = rs.getString(6); 
//				String hiredate = rs.getString(7); 
//				String salary = rs.getString(8); 
				String departmentId = rs.getString(9); 
				String jobId = rs.getString(10); 
				String address = rs.getString(11); 
				String city = rs.getString(12); 
				String state = rs.getString(13); 
				String zipcode = rs.getString(14); 
				emp = new Employee(eid, firstName,lastName, 
						departmentId, jobId, address, city, state, zipcode); 
			}
			rs.close(); 
			statement.close(); 
			conn.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}
	public ArrayList<ArrayList> getAllEmployees (String qry) { 
		ArrayList<ArrayList> arraylistquery = new ArrayList<>(); 
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student"); 
			Statement statement = conn.createStatement(); 
			ResultSet rs = statement.executeQuery(qry); 
			ResultSetMetaData md = rs.getMetaData(); 
			
			ArrayList<String> list = new ArrayList<> (); 
			for(int i=1; i <= md.getColumnCount(); i++ ) { 
				list.add(md.getColumnName(i)); 
			}
			System.out.println("InDAO");
			arraylistquery.add(list); 
			
			int x = md.getColumnCount();
			while (rs.next()) { 
				ArrayList<String> row = new ArrayList<>(); 
				for (int i=1; i <= x; i++) { 
					row.add(rs.getString(i)); 
				}
				arraylistquery.add(row); 
				System.out.println(row);
			}
			
			rs.close(); 
			statement.close(); 
			conn.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return arraylistquery; 
	}
	public int addEmployee(String firstname, String lastname, String departmentId, String jobId, String address,
			String city, String state, String zipcode) {
		int updateCount = 0;
		String sql = "INSERT INTO employees (firstname, lastname, department_id, job_id,"
				                           + " address, city, state, zipcode) Values ('"
				+firstname+"','"+lastname+"',"+departmentId+","+jobId+",'"
				    +address+"','"+city+"','"+state+"','"+zipcode+ "');";

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement(); 
			 updateCount = statement.executeUpdate(sql); 

			statement.close(); 
			conn.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
		return updateCount;
		
	}
		
	}


