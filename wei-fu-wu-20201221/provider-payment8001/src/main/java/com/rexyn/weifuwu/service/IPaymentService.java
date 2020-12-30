package com.rexyn.weifuwu.service;

import com.rexyn.weifuwu.entity.Payment;

import java.util.List;

public interface IPaymentService {
    String getById(Long id);
    List<Payment> list();
    Long create(Payment payment);
}
