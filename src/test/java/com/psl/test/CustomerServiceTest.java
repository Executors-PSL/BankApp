package com.psl.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psl.bean.Customer;
import com.psl.service.DaoService;

import java.util.*;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "CustomerServiceTest-context.xml")
public class CustomerServiceTest {

	@Autowired
	private DaoService service;

	
	@Test
	public void testingAddCustomer(){
		
//		Customer cust = new Customer();
//		cust.setFirstName("mpc");
//		String s = service.addCustomer(cust);
	
		String s = service.fortesting();
		
//		int l = s.length();
//		Assert.assertArrayEquals(l,s.length());
		Assert.assertTrue(s.equals("tested"));
		
		
		
	}
	
	
	@Test
	public void testCustomerList(){

		/*CustomerTestConfig cds = new CustomerTestConfig();
		
		CustomerService cs = cds.getService();*/
		
		
		List<Customer> checkList = new ArrayList<Customer>();
		
		Customer c1 = new Customer();
		c1.setFirstName("Shubham");
		checkList.add(c1);
		Customer c2 = new Customer();
		c2.setFirstName("Poonam");
		checkList.add(c2);
		Customer c3 = new Customer();
		c3.setFirstName("Ajit");
		checkList.add(c3);
		
		List<Customer> dbValues = service.getAllCustomers();		
		Assert.assertTrue(dbValues.size()>0);
//		Assert.assertTrue(checkList.size()==dbValues.size());
		
	}
	
//...........................................................................	
	
	/*@Test
	public void testCustomerListNegative(){

		CustomerTestConfig cds = new CustomerTestConfig();
		
		CustomerService cs = cds.getService();
		
		
		List<Customer> checkList = new ArrayList<Customer>();
		
		Customer c1 = new Customer();
		c1.setFirstName("Shubham");
		checkList.add(c1);
		Customer c2 = new Customer();
		c2.setFirstName("Poonam");
		checkList.add(c2);
		Customer c3 = new Customer();
		c3.setFirstName("Ajit");
		checkList.add(c3);
		
		List<Customer> dbValues = service.getAllCustomers();		
		Assert.assertTrue(dbValues.size()<=0);
//		Assert.assertTrue(checkList.size()==dbValues.size());
		
	}*/
	
	//...........................................................................	
	
	
	@Test
	public void testAddCustomer(){
		
//		Customer cust =null;
//		String res = service.addCustomer(new Customer());
	
		Assert.assertEquals("class com.psl.service.DaoService",this.service.getClass().toString());
//		Assert.assertTrue(res.equals("success"));
		
	}
	
	
}
