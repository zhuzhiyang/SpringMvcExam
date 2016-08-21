package com.hand.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Model.Address;
import com.hand.Service.AddressService;
import com.hand.dao.AddressMapper;
@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService {
  @Autowired
	private AddressMapper addressMapper;
	@Override
	public List<Address> selectAddress() {
		// TODO Auto-generated method stub
		return addressMapper.selectAddress();
	}
	public AddressMapper getAddressMapper() {
		return addressMapper;
	}
	public void setAddressMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

}
