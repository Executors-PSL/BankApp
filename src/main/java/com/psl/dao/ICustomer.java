package com.psl.dao;

import com.psl.bean.Customer;
import java.util.*;
public interface ICustomer {

		void addCustomer(Customer cust);
		void addUser(String user,String password);
		List<Customer> getAllCustomers();
}
