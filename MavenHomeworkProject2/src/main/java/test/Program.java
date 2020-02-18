package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CEO;
import beans.Employee;

public class Program {
	public static void main(String[] args) {
		
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)){

			
			CEO ceo = ctx.getBean(CEO.class);
			ceo.setName("Nir Gal");
			ceo.setSalary(25000);
			ceo.setYearlyBonus(5000);
			System.out.println(ceo);
			Employee emp1 = ctx.getBean(Employee.class, "Dan", 5000, "Java full stack", 10);
			Employee emp2 = ctx.getBean(Employee.class, "Bob", 7000, "Database managment", 7);
			Employee emp3 = ctx.getBean(Employee.class, "Maya", 6500, "Application architecture", 8);
			
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		}
		
	}

}
