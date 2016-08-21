package com.hand.dao;

import java.util.List;

import com.hand.Model.Customer;
import com.hand.util.Page;

public interface CustomerMapper {
    void deleteByPrimaryKey(Short customerId);

    int insert(Customer record);

    void insertSelective(Customer record);

    Customer selectByPrimaryKey(Short customerId);

    void updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    List<Customer> selectCustomers();
    List<Customer> selectCustomersByPage(Page page);
    Integer selectCustomersCount();

}