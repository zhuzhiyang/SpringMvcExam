package com.hand.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Model.Customer;
import com.hand.Service.CustomerService;
import com.hand.dao.CustomerMapper;
import com.hand.util.Page;
@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		return customerMapper.selectCustomers();
	}
	public CustomerMapper getCustomerMapper() {
		return customerMapper;
	}
	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}
	@Override
	public List<Customer> selectCustomersByPage(Page page) {
		
		return customerMapper.selectCustomersByPage(page);
	}
	@Override
	public Integer selectCustomersCount() {
		// TODO Auto-generated method stub
		return customerMapper.selectCustomersCount();
	}
	@Override
	public void insertSelective(Customer record) {
		customerMapper.insertSelective(record);
	}
	@Override
	public Customer selectByPrimaryKey(Short customerId) {
		
		return customerMapper.selectByPrimaryKey(customerId);
	}
	@Override
	public void updateByPrimaryKeySelective(Customer record) {
		    
		  customerMapper.updateByPrimaryKeySelective(record);
		
	}
	@Override
	public void deleteByPrimaryKey(Short customerId) {
		customerMapper.deleteByPrimaryKey(customerId);
		
	}

}
