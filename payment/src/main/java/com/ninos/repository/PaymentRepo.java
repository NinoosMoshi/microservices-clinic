package com.ninos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninos.model.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

    Optional<Payment> findByTransId(String transId);

    List<Payment> findAllByPatientId(Long id);

}
