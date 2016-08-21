package com.hand.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Service.PaymentService;
import com.hand.dao.PaymentMapper;

@Service("paymentServiceImpl")
public class PaymentServiceImpl implements PaymentService {
@Autowired
	private PaymentMapper paymentMapper;
	@Override
	public void deletePayment(int id) {
	   paymentMapper.deletePayment(id);
		
	}
	public PaymentMapper getPaymentMapper() {
		return paymentMapper;
	}
	public void setPaymentMapper(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}

}
