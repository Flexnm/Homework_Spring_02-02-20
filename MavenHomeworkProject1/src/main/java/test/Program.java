package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Driver;
import beans.Car;

public class Program {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)) {

			
			
//			Driver myDriver = ctx.getBean(Driver.class, "Speedy", 25, 4); cant do this because singleton....
			Driver myDriver = ctx.getBean(Driver.class);
			myDriver.setAge(25);
			myDriver.setName("Speedy");
			myDriver.setNumberOfMedals(4);
			
			System.out.println(myDriver);
			
			
			Car car1 = ctx.getBean(Car.class, "Subaro", 1980, myDriver);
			
			System.out.println(car1);
			System.out.println("Time has passed...");
			
			myDriver.setAge(26);
			Car car2 = ctx.getBean(Car.class, "Ferrari", 2017, myDriver);
			System.out.println(car2);
			System.out.println("Time has passed...");
			
			myDriver.setNumberOfMedals(8);
			myDriver.setAge(27);
			Car car3 = ctx.getBean(Car.class, "Smart", 2004, myDriver);
			System.out.println(car3);
			
		}
		
		
		
	}

}
