package database;

import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

public class CustomerDatabase {

	private static Connection con = DBConnection.getConnection();
	public List<Customer> getAllCustomers() throws SQLException{
		List<Customer> customers = new ArrayList<Customer>();
		String sql="select * from customer";
		//Statement
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			Customer customer = new Customer();
			customer.setCustomer_id(rs.getInt(1));
			customer.setCust_name(rs.getString(2));
			customer.setCity(rs.getString(3));
			customer.setCountry(rs.getString(4));
			customer.setMail(rs.getString(5));
			customer.setPhone(rs.getString(6));
			customers.add(customer);
		}
		return customers;
	}
	//INSERT
	public boolean insertCustomer(Customer customer )throws SQLException{
		String prepstsql="insert into Customer(customer_id,cust_name,city,country,email,phone)values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(prepstsql);
		ps.setInt(1,customer.getCustomer_id());
		ps.setString(2,customer.getCust_name());
		ps.setString(3,customer.getCity());
		ps.setString(4,customer.getCountry());
		ps.setString(5,customer.getMail());
		ps.setString(6,customer.getPhone());
		ps.executeUpdate();
		return true;
	}
	
	//UPDATE
	public boolean updateCustomer(Customer customer) throws SQLException{
		String prepstsql = "update customer "
				+"set cust_name=?,"
				+"city=?"
				+"where customer_id=11;";
		System.out.println(prepstsql);
		PreparedStatement ps =con.prepareStatement(prepstsql);
		ps.setString(1, customer.getCust_name());
		ps.setString(2, customer.getCity());
		ps.executeUpdate();
		return true;
	}
	
	//DELETE
	public boolean deleteCustomer(Customer customer) throws SQLException{
		String prepstsql = "delete from customer "
				+"where customer_id=11;";
		System.out.println(prepstsql);
		PreparedStatement ps =con.prepareStatement(prepstsql);
		ps.executeUpdate();
		return true;
	}
	
	
	
	
}
