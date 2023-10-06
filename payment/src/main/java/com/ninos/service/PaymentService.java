package com.ninos.service;

import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninos.mapper.PaymentMapper;
import com.ninos.model.dto.PaymentDTO;
import com.ninos.model.entity.Payment;
import com.ninos.repository.PaymentRepo;

@RequiredArgsConstructor
@Service
public class PaymentService {

    private final PaymentRepo paymentRepo;

    @Autowired
    private PaymentMapper paymentMapper;

    public PaymentDTO getPayment(String transId){
        Optional<Payment> payment = paymentRepo.findByTransId(transId);
        return paymentMapper.toDTO(payment.get());
    }


    public PaymentDTO addPayment(PaymentDTO paymentDTO){
        String transId = UUID.randomUUID().toString();
        paymentDTO.setTransId(transId);

        Payment payment = paymentMapper.toEntity(paymentDTO);
        Payment savedPayment = paymentRepo.save(payment);

        return paymentMapper.toDTO(savedPayment);
    }


}
