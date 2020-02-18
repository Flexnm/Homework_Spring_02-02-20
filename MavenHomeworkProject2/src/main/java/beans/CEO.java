package beans;

import org.springframework.stereotype.Component;

@Component
public class CEO extends Worker {
	

	private double yearlyBonus;
	
	public CEO() {

	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}
	
	public String toString() {
		return "CEO: " + super.getName() + ", Salary: " + super.getSalary() + ", YearlyBonus: " + yearlyBonus;
	}

}
