package com.rexyn.weifuwu.mapper;

import com.rexyn.weifuwu.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    String getById(Long id);

    List<Payment> list();

    Long create(Payment payment);
}
