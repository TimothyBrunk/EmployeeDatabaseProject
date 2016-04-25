package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
				String lastName = rs.getString(4);
				String departmentId = rs.getString(9);
				String jobId = rs.getString(10);
				String address = rs.getString(11);
				String city = rs.getString(12);
				String state = rs.getString(13);
				String zipcode = rs.getString(14);
				emp = new Employee(eid, firstName, lastName, departmentId, jobId, address, city, state, zipcode);
			}
			rs.close();
			statement.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	@Override
	public Employee getEmpByName(String firstname, String lastname) {
		Employee emp = null;
		String sql = "Select * from employees where firstname ='"+firstname+"' AND lastname ='"+lastname+"';";
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement(); 
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String eid = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(4);
				String departmentId = rs.getString(11);
				String jobId = rs.getString(12);
				String address = rs.getString(13);
				String city = rs.getString(14);
				String state = rs.getString(15);
				String zipcode = rs.getString(16);
				emp = new Employee(eid, firstName, lastName, departmentId, jobId, address, city, state, zipcode);
			}
			rs.close();
			statement.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	public ArrayList<ArrayList> getAllEmployees(String qry) {
		ArrayList<ArrayList> arraylistquery = new ArrayList<>();
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			ResultSetMetaData md = rs.getMetaData();

			ArrayList<String> list = new ArrayList<>();
			for (int i = 1; i <= md.getColumnCount(); i++) {
				list.add(md.getColumnName(i));
			}
			System.out.println("InDAO");
			arraylistquery.add(list);

			int x = md.getColumnCount();
			while (rs.next()) {
				ArrayList<String> row = new ArrayList<>();
				for (int i = 1; i <= x; i++) {
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

	public int addEmployee(Employee e) {
		int updateCount = 0;
		String insertTable = "INSERT INTO employees (firstname, lastname, department_id, job_id, "
				+ "address,city,state,zipcode) VALUES (?,?,?,?,?,?,?,?)";
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			PreparedStatement stmt = conn.prepareStatement(insertTable);
			stmt.setString(1, e.getFirstName());
			stmt.setString(2, e.getLastName());
			stmt.setString(3, e.getDepartmentId());
			stmt.setString(4, e.getJobId());
			stmt.setString(5, e.getAddress());
			stmt.setString(6, e.getCity());
			stmt.setString(7, e.getState());
			stmt.setString(8, e.getZipcode());
			updateCount = stmt.executeUpdate();
			statement.close();
			conn.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return updateCount;

	}

	@Override
	public int deleteEmployee(Employee e) {
		int updateCount = 0;
		String insertTable = "DELETE FROM employees WHERE id = ?;"; 
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			PreparedStatement stmt = conn.prepareStatement(insertTable);
			stmt.setString(1, e.getEid());
			updateCount = stmt.executeUpdate();
			statement.close();
			conn.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return updateCount;

}

	public int updateEmployee(Employee e) {
		int updateCount = 0;
		String insertTable = "UPDATE employees SET firstname = ?, lastname = ?,  department_id = ?, job_id = ?, "
				+ "address = ?, city = ?, state = ?, zipcode=? WHERE id = ?; ";
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			PreparedStatement stmt = conn.prepareStatement(insertTable);
			stmt.setString(1, e.getFirstName());
			stmt.setString(2, e.getLastName());
			stmt.setString(3, e.getDepartmentId());
			stmt.setString(4, e.getJobId());
			stmt.setString(5, e.getAddress());
			stmt.setString(6, e.getCity());
			stmt.setString(7, e.getState());
			stmt.setString(8, e.getZipcode());
			stmt.setString(9, e.getEid());
			updateCount = stmt.executeUpdate();
			statement.close();
			conn.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return updateCount;

	}

}
