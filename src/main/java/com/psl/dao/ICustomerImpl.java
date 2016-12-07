package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.psl.bean.Customer;
@Component(value="dao")
public class ICustomerImpl implements ICustomer {
	@Autowired
	JdbcTemplate template;

	public void addCustomer(Customer cust) {
		/*template.update("insert into customer values(" + cust.getId() + ",'"
				+ cust.getName() + "')"

		);*/
	}

	public void addUser(String user, String password) {
		template.update("insert into userlog values('"+user+"','"+password+"')");
	}

	public List<Customer> getAllCustomers() {
		
//		System.out.println("in allcustomers");
		
		String sql = "select * from customer";
		return template.query(sql, new RowMapper<Customer>(){

			public Customer mapRow(ResultSet rs, int rn)
					throws SQLException {				
				Customer customer = new Customer();
				customer.setFirstName(rs.getString(2));
				return customer;
			}			
		});
	}

}
