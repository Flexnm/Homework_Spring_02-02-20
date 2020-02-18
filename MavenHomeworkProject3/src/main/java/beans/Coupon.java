package beans;

import java.sql.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coupon {
	
	private int id;
	private int companyID;
	private Category category;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	private int amount;
	private double price;
	private String image;
	
	
	public Coupon() {
		
	}
	/**
	 * @param companyID, category, title, description, startDate, endDate, amount, price, image
	 * @usage to insert a new coupon to the coupons table.
	 */
	
	public Coupon(int companyID, Category category, String title, String description, Date startDate,
			Date endDate, int amount, double price, String image) {
		setCompanyID(companyID);
		setCategory(category);
		setTitle(title);
		setDescription(description);
		setStartDate(startDate);
		setEndDate(endDate);
		setAmount(amount);
		setPrice(price);
		setImage(image);
	}
	
	/**
	 * @param id, companyID, category, title, description, startDate, endDate, amount, price, image
	 * @usage to call to coupon from the coupons table.
	 */
	
	public Coupon(int id, int companyID, Category category, String title, String description, Date startDate,
			Date endDate, int amount, double price, String image) {
		this.id = id;
		setCompanyID(companyID);
		setCategory(category);
		setTitle(title);
		setDescription(description);
		setStartDate(startDate);
		setEndDate(endDate);
		setAmount(amount);
		setPrice(price);
		setImage(image);
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}
	
	
	public String toString() {
		return "\nCoupon #" + id + "\nTitle: " + title + ", Category: " + category + ", Company: " + companyID + "\ndescription: " + description +  ".\nAmount: " + amount + ", Price: " + price + "\nDuration: " + startDate + " - " + endDate + "\n";
	}
	

}
