package com.hand.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Service.RentalService;
import com.hand.dao.RentalMapper;
@Service("rentalServiceImpl")
public class RentalServiceImpl implements RentalService {
@Autowired
 private RentalMapper rentalMapper;	
	@Override
	public void deleteRental(int id) {
	  rentalMapper.deleteRental(id);
	}
	public RentalMapper getRentalMapper() {
		return rentalMapper;
	}
	public void setRentalMapper(RentalMapper rentalMapper) {
		this.rentalMapper = rentalMapper;
	}

}
