package beans;

import org.springframework.stereotype.Component;

@Component
public class Driver {

	private String name;
	private int age;
	private int numberOfMedals;

//	public Driver() {
//
//	}
//
//	public Driver(String name, int age, int numberOfMedals) {
//		super();
//		setName(name);
//		setAge(age);
//		setNumberOfMedals(numberOfMedals);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfMedals() {
		return numberOfMedals;
	}

	public void setNumberOfMedals(int numberOfMedals) {
		this.numberOfMedals = numberOfMedals;
	}

	public String toString() {
		return name + ", a " + age + " years old driver that has " + numberOfMedals + " medals.";
	}

}
