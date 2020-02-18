package test;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Company;
import dao.CompaniesDBDAO;
import dao.ConnectionPool;

public class Program {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)) {

			CompaniesDBDAO compDB = ctx.getBean(CompaniesDBDAO.class);
			CompaniesDBDAO compDB2 = ctx.getBean(CompaniesDBDAO.class);

			System.out.println(compDB.getAllCompanies());

		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			ConnectionPool.getInstance().closeAllConnections();
		}
	}

}
