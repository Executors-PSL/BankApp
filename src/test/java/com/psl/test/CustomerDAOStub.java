package com.psl.test;

import java.util.List;

import com.psl.bean.Customer;
import com.psl.dao.ICustomer;

public class CustomerDAOStub implements ICustomer{

	private String status;
	
	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		status = "tested";
//		return status;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUser(String user, String password) {
		// TODO Auto-generated method stub
		
	}
	
}
