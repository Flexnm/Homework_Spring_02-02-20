package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Worker {
	
	private String name;
	private double salary;
	
	public Worker() {
		
	}
	
	public Worker(String name, double salary) {
		setName(name);
		setSalary(salary);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
