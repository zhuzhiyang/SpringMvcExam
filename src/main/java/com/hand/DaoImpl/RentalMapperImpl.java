package com.hand.DaoImpl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Model.Rental;
import com.hand.dao.RentalMapper;

@Repository("rentalMapperImpl")
public class RentalMapperImpl extends SqlSessionDaoSupport implements RentalMapper{

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public int deleteByPrimaryKey(Integer rentalId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Rental record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Rental record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rental selectByPrimaryKey(Integer rentalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Rental record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Rental record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  void deleteRental(int id) {
		getSqlSession().delete("com.hand.dao.RentalMapper.deleteRental", id);
	}
  
	
}
