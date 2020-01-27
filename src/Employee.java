/*
 * Employee.java
 */

/**
 *
 * @author Edgar Cole
 */
public class Employee {

	// Name your member variables as follows: firstName, lastName and monthlySalary
	private String firstName;
	private String lastName;
	private double monthlySalary;

	// Implement a three-parameter constructor that takes, in order: the first name,
	// last name and monthly salary
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		}
	}

	// Your accessor methods should be named following the pattern getVariableName.
	// e.g.: getFirstName
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	// Your mutator methods should be named following the pattern setVariableName.
	// e.g.: setFirstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
	}

}
