package com.hand.dao;

import java.util.List;

import com.hand.Model.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Short addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Short addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    List<Address> selectAddress();
}