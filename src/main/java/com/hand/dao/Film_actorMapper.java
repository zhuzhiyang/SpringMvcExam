package com.hand.dao;

import com.hand.Model.Film_actor;
import com.hand.Model.Film_actorKey;

public interface Film_actorMapper {
    int deleteByPrimaryKey(Film_actorKey key);

    int insert(Film_actor record);

    int insertSelective(Film_actor record);

    Film_actor selectByPrimaryKey(Film_actorKey key);

    int updateByPrimaryKeySelective(Film_actor record);

    int updateByPrimaryKey(Film_actor record);
}