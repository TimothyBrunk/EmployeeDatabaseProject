package data;

public class Employee {
	private String eid;
	private String firstName;
	private String lastName;
	private String departmentId;
	private String jobId;
	private String address;
	private String city;
	private String state;
	private String zipcode;

	public Employee() {

	}

	public Employee(String eid, String firstName,  String lastName, 
			String departmentId, String jobId, String address, String city, String state,
			String zipcode) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
		this.jobId = jobId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	public String getMiddleName() {
//		return middleName;
//	}
//
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getHiredate() {
//		return hiredate;
//	}
//
//	public void setHiredate(String hiredate) {
//		this.hiredate = hiredate;
//	}
//
//	public String getSalary() {
//		return salary;
//	}

//	public void setSalary(String salary) {
//		this.salary = salary;
//	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}



//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ",  lastName="
				+ lastName + ", gender=" + ", hiredate=" +  ", salary=" +  ", departmentId="
				+ departmentId + ", jobId=" + jobId + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";

	
	}
	

}
