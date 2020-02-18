package beans;

import java.util.ArrayList;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Company {

	private int id;
	private String name;
	private String email;
	private String password;
	private ArrayList<Coupon> coupons = new ArrayList<Coupon>();

	
	public Company() {
		
	}
	
	/**
	 * @param id, name, email, password
	 * @usage to call to a company from the companies table.
	 */

	public Company(int id, String name, String email, String password) {
		this.id = id;
		setName(name);
		setEmail(email);
		setPassword(password);
	}
	
	/**
	 * @param name, email, password
	 * @usage to insert a new company to the companies table.
	 */
	
	public Company(String name, String email, String password) {
		setName(name);
		setEmail(email);
		setPassword(password);
	}

	public Company(String name, String email, String password, ArrayList<Coupon> coupons) {
		setName(name);
		setEmail(email);
		setPassword(password);
		setCoupons(coupons);
	}

	public Company(int id, String name, String email, String password, ArrayList<Coupon> coupons) {
		this.id = id;
		setName(name);
		setEmail(email);
		setPassword(password);
		setCoupons(coupons);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(ArrayList<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	public void addCoupon(Coupon coupon) {
		this.coupons.add(coupon);
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "\nCompany: " + name + ", Contact Email: " + email + " Has coupons:\n" + coupons;
	}

}
