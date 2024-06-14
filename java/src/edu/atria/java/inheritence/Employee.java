package edu.atria.java.inheritence;

public class Employee extends Citizen {
	private int emoid;
	private String name;
	private String designation;
	private double salary;
	
	//constructor field
	public Employee(long aadharNo, long voterid, String nationality, int emoid, String name, String designation,
			double salary) {
		super(aadharNo, voterid, nationality);
		this.emoid = emoid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	//getters and setters

	public int getEmoid() {
		return emoid;
	}

	public void setEmoid(int emoid) {
		this.emoid = emoid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//toString

	@Override
	public String toString() {
		return "Employee [emoid=" + emoid + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", getAadharNo()=" + getAadharNo() + ", getVoterid()=" + getVoterid() + ", getNationality()="
				+ getNationality() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
