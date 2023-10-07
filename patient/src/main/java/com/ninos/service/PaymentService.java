package com.ninos.service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ninos.model.dto.PaymentDTO;
import com.ninos.proxy.PatientPaymentProxy;

@RequiredArgsConstructor
@Service
public class PaymentService {


    private final PatientPaymentProxy patientPaymentProxy;


    public List<PaymentDTO> getAllPatientPayments(Long patientId){
        return patientPaymentProxy.getPatientPayments(patientId);
    }




}
