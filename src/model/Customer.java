package model;

public class Customer {

	private int customer_id;
	private String cust_name;
	private String city;
	private String country;
	private String mail;
	private String phone;
	
	public Customer() {
		
	}
	
	public Customer(int customer_id, String cust_name, String city, String country, String mail, String phone) {
		super();
		this.customer_id = customer_id;
		this.cust_name = cust_name;
		this.city = city;
		this.country = country;
		this.mail = mail;
		this.phone = phone;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", cust_name=" + cust_name + ", city=" + city + ", country="
				+ country + ", mail=" + mail + ", phone=" + phone + "]";
	}
	
}
