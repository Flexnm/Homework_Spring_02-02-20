package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee extends Worker {
	
	private String jobDescription;
	private int numDaysOff;
	@Autowired
	private CEO manager;
	
	public Employee(String name, double salary, String jobDescription, int numDaysOff) {
		super(name, salary);
		setJobDescription(jobDescription);
		setNumDaysOff(numDaysOff);
		setManager(manager);
	}


	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getNumDaysOff() {
		return numDaysOff;
	}

	public void setNumDaysOff(int numDaysOff) {
		this.numDaysOff = numDaysOff;
	}

	public CEO getManager() {
		return manager;
	}

	public void setManager(CEO manager) {
		this.manager = manager;
	}
	
	public String toString() {
		return "Employee " + jobDescription + ": " + super.getName() + ", Salary: " + super.getSalary() + ", " + numDaysOff + " days off, works under " + manager;
	}

}
