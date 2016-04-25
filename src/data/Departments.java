package data;

public class Departments {
	private int research = 1; 
	private int administration = 2; 
	private int softwareDevelopment = 3; 
	private int hardwareDevelopment = 4; 
	private int testAndIntegration = 5; 
	private int sales = 6; 
	private int hr = 7; 
	private int facilites = 8; 
	private int operations = 9; 
	private int documentation = 10;
	
	public Departments() { 
		
	}
	
	public Departments(int research, int administration, int softwareDevelopment, int hardwareDevelopment,
			int testAndIntegration, int sales, int hr, int facilites, int operations, int documentation) {
		super();
		this.research = research;
		this.administration = administration;
		this.softwareDevelopment = softwareDevelopment;
		this.hardwareDevelopment = hardwareDevelopment;
		this.testAndIntegration = testAndIntegration;
		this.sales = sales;
		this.hr = hr;
		this.facilites = facilites;
		this.operations = operations;
		this.documentation = documentation;
	}

	public int getResearch() {
		return research;
	}

	public void setResearch(int research) {
		this.research = research;
	}

	public int getAdministration() {
		return administration;
	}

	public void setAdministration(int administration) {
		this.administration = administration;
	}

	public int getSoftwareDevelopment() {
		return softwareDevelopment;
	}

	public void setSoftwareDevelopment(int softwareDevelopment) {
		this.softwareDevelopment = softwareDevelopment;
	}

	public int getHardwareDevelopment() {
		return hardwareDevelopment;
	}

	public void setHardwareDevelopment(int hardwareDevelopment) {
		this.hardwareDevelopment = hardwareDevelopment;
	}

	public int getTestAndIntegration() {
		return testAndIntegration;
	}

	public void setTestAndIntegration(int testAndIntegration) {
		this.testAndIntegration = testAndIntegration;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getFacilites() {
		return facilites;
	}

	public void setFacilites(int facilites) {
		this.facilites = facilites;
	}

	public int getOperations() {
		return operations;
	}

	public void setOperations(int operations) {
		this.operations = operations;
	}

	public int getDocumentation() {
		return documentation;
	}

	public void setDocumentation(int documentation) {
		this.documentation = documentation;
	} 
	
	
	
	
	
	
	

}
