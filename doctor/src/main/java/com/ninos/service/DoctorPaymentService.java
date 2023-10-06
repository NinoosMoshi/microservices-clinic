package com.ninos.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.ninos.model.dto.PaymentDTO;
import com.ninos.proxy.DoctorPaymentProxy;

@RequiredArgsConstructor
@Service
public class DoctorPaymentService {

    private final DoctorPaymentProxy doctorPaymentProxy;

    public PaymentDTO addPayment(PaymentDTO paymentDTO){
        return doctorPaymentProxy.addNewPayment(paymentDTO);
    }


    public PaymentDTO getPayment(String transId){
        return doctorPaymentProxy.getPaymentById(transId);
    }


}
