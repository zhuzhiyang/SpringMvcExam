package com.hand.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Model.Actor;
import com.hand.dao.ActorMapper;
import com.hand.util.Page;
@Repository("actorMapperImpl")
public  class ActorMapperImpl extends SqlSessionDaoSupport implements ActorMapper {
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public int deleteByPrimaryKey(Short actorId) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int insert(Actor actor) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hand.dao.ActorMapper.insert",actor);
	}
	public int insertSelective(Actor record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Actor selectByPrimaryKey(Short actorId) {
		// TODO Auto-generated method stub
		return null;
	}
	public int updateByPrimaryKeySelective(Actor record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int updateByPrimaryKey(Actor record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<Actor> selectActors(Page page) {
		return 	getSqlSession().selectList("com.hand.dao.ActorMapper.selectActors",page);	  
	}
	@Override
	public long getProductsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
