package client;

import java.sql.SQLException;

import database.CustomerDatabase;
import model.Customer;

public class Ctest {

	public static void main(String[] args) throws SQLException {
		CustomerDatabase database = new CustomerDatabase();
		
//		Customer customer=new Customer();
//		customer.setCustomer_id(12);
//		customer.setCust_name("Alok");
//		customer.setCity("Gaur");
//		customer.setCountry("Nepal");
//		customer.setMail("alok@hcl.com");
//		customer.setPhone("498511789");
//		database.insertCustomer(customer);
//		System.out.println();
//		
//		
//		
//		
//		
//		for(Customer customer1 : database.getAllCustomers())
//			System.out.println(customer1);
//		
		
//		Customer customer1 =new Customer();
//		customer1.setCust_name("Raju");
//		customer1.setCity("PherHeraPheri");
//		database.updateCustomer(customer1);
//		for(Customer customers:database.getAllCustomers())
//			System.out.println(customers);
		
		
		
		Customer customer1 =new Customer();
		database.deleteCustomer(customer1);
		for(Customer customers:database.getAllCustomers())
			System.out.println(customers);
	}
	}

