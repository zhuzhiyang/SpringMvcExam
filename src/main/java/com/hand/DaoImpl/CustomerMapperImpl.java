package com.hand.DaoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Model.Customer;
import com.hand.dao.CustomerMapper;
import com.hand.util.Page;
@Repository("customerMapperImpl")
public class CustomerMapperImpl extends SqlSessionDaoSupport implements CustomerMapper {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public void deleteByPrimaryKey(Short customerId) {
		// TODO Auto-generated method stub
		getSqlSession().delete("com.hand.dao.CustomerMapper.deleteByPrimaryKey", customerId);
	}

	@Override
	public int insert(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertSelective(Customer record) {
		
	getSqlSession().insert("com.hand.dao.CustomerMapper.insertSelective",record);
	}

	@Override
	public Customer selectByPrimaryKey(Short customerId) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("com.hand.dao.CustomerMapper.selectByPrimaryKey", customerId);
	}

	@Override
	public void  updateByPrimaryKeySelective(Customer record) {
		
		// TODO Auto-generated method stub
		getSqlSession().update("com.hand.dao.CustomerMapper.updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		return 	getSqlSession().selectList("com.hand.dao.CustomerMapper.selectCustomers");	  
	}
	@Override
	public List<Customer> selectCustomersByPage(Page page) {
	 
		return 	getSqlSession().selectList("com.hand.dao.CustomerMapper.selectCustomersByPage",page);	 
	}
	@Override
	public Integer selectCustomersCount() {
		return 	getSqlSession().selectOne("com.hand.dao.CustomerMapper.selectCustomersCount");	
	}

}
