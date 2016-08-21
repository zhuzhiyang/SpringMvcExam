package com.hand.DaoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Model.Address;
import com.hand.dao.AddressMapper;
@Repository("addressMapperImpl")
public class AddressMapperImpl extends SqlSessionDaoSupport  implements AddressMapper {
@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public int deleteByPrimaryKey(Short addressId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Address record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Address record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Address selectByPrimaryKey(Short addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Address record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Address record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Address> selectAddress() {
		// TODO Auto-generated method stub
		return 	getSqlSession().selectList("com.hand.dao.AddressMapper.selectAddress");	   
	}

}
