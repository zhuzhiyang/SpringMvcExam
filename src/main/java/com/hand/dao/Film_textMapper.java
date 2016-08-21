package com.hand.dao;

import com.hand.Model.Film_text;

public interface Film_textMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film_text record);

    int insertSelective(Film_text record);

    Film_text selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film_text record);

    int updateByPrimaryKeyWithBLOBs(Film_text record);

    int updateByPrimaryKey(Film_text record);
}