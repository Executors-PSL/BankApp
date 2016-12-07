package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.bean.Customer;
import com.psl.dao.ICustomer;

@Component(value = "service")
public class DaoService {
	@Autowired
	ICustomer dao;

	public void addCustomer(Customer customer) {

		dao.addCustomer(customer);

	}
	
	/*public String addCustomer(Customer cust) {
		dao.addCustomer(cust);
		return "success";
	}*/

	public void addUser(String user, String password) {
		dao.addUser(user, password);
	}
	
	public String fortesting(){
		return "tested";
	}
	
	public List<Customer> getAllCustomers(){
		return dao.getAllCustomers();
	}
}
