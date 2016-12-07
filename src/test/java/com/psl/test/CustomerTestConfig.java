package com.psl.test;



import org.springframework.context.annotation.Bean;

import com.psl.dao.ICustomer;
//import com.psl.service.CustomerService;
import com.psl.service.DaoService;

public class CustomerTestConfig {

	@Bean
	DaoService getService(){
		return new DaoService();
	}
	
	@Bean
	ICustomer getDAO(){
		return new CustomerDAOStub();
	}
	
}
