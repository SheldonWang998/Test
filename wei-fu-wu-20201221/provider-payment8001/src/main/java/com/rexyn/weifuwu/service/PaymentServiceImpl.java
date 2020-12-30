package com.rexyn.weifuwu.service;

import com.rexyn.weifuwu.entity.Payment;
import com.rexyn.weifuwu.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements IPaymentService{
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public String getById(Long id) {
        return paymentMapper.getById(id);
    }

    @Override
    public List<Payment> list() {
        return paymentMapper.list();
    }

    @Override
    public Long create(Payment payment) {
        return paymentMapper.create(payment);
    }
}
