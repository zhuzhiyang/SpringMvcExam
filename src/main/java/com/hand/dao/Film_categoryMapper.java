package com.hand.dao;

import com.hand.Model.Film_category;
import com.hand.Model.Film_categoryKey;

public interface Film_categoryMapper {
    int deleteByPrimaryKey(Film_categoryKey key);

    int insert(Film_category record);

    int insertSelective(Film_category record);

    Film_category selectByPrimaryKey(Film_categoryKey key);

    int updateByPrimaryKeySelective(Film_category record);

    int updateByPrimaryKey(Film_category record);
}