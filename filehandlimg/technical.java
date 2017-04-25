package day;

public class technical extends Employee {
	String grade;
	String jobdis;
	double tsalary;

	public technical(String name, String date, int eid, double bsalary,
			String grade, String jobdis) {
		super(name, date, eid, bsalary);
	 tsalary=bsalary;
		this.grade = grade;
		this.jobdis = jobdis;
	}

	public void showdetails() {
		System.out.println("employe id" + this.eid + "\nemploye name"
				+ this.name + "\njoining date" + this.date + "basicn salary"
				+ this.bsalary);

	}

	public void calsal() {
		double bonus = 0.1 * (tsalary);
		double salary = bonus + this.tsalary;
		System.out.println("total salary:" + salary);
	}

}
