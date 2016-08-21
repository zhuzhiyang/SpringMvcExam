package com.hand.DaoImpl;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Model.Payment;
import com.hand.dao.PaymentMapper;

@Repository("paymentMapperImpl")
public class PaymentMapperImpl extends SqlSessionDaoSupport implements PaymentMapper{
   @Autowired
public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	// TODO Auto-generated method stub
	super.setSqlSessionFactory(sqlSessionFactory);
}
	@Override
	public int deleteByPrimaryKey(Short paymentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Payment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Payment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Payment selectByPrimaryKey(Short paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Payment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Payment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deletePayment(int id) {
		getSqlSession().delete("com.hand.dao.PaymentMapper.deletePayment", id);
		
	}

	
}
