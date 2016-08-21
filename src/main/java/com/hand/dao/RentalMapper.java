package com.hand.dao;

import com.hand.Model.Rental;

public interface RentalMapper {
    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    int insertSelective(Rental record);

    Rental selectByPrimaryKey(Integer rentalId);

    int updateByPrimaryKeySelective(Rental record);

    int updateByPrimaryKey(Rental record);
     void deleteRental(int id);
}