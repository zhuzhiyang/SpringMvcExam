package com.hand.Service;

import java.util.List;

import com.hand.Model.Customer;
import com.hand.util.Page;

public interface CustomerService {
	 List<Customer> selectCustomers();
	   List<Customer> selectCustomersByPage(Page page);
	   Integer selectCustomersCount();
	   void insertSelective(Customer record);
	   Customer selectByPrimaryKey(Short customerId);
	   void updateByPrimaryKeySelective(Customer record);
	   void deleteByPrimaryKey(Short customerId);
}
