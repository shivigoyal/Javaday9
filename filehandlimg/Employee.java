package day;

public abstract class Employee {
	String name;
	String date;
	int eid;
	double bsalary;
	public Employee(String name, String date, int eid, double bsalary) {
		
		this.name = name;
		this.date = date;
		this.eid = eid;
		this.bsalary = bsalary;
	}
	
	public void calsal(){}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
			

}
