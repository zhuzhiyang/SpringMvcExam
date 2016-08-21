package com.hand.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hand.Model.Actor;
import com.hand.util.Page;
public interface ActorMapper {
    int deleteByPrimaryKey(Short actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Short actorId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);

    long getProductsCount();  
    List<Actor> selectActors(Page page);
//    List<Actor> selectActors(List<Integer> list);
}