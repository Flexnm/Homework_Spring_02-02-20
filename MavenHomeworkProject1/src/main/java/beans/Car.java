package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
	
	private String model;
	private int year;
	@Autowired
	private Driver driver;
	
	public Car(String model, int year, Driver driver) {
		setModel(model);
		setYear(year);
		setDriver(driver);
	}
	
	public String gerModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String toString() {
		return "The " + year + " " + model + " car is driven by " + driver;
	}

}
