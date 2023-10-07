package com.ninos.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ninos.model.dto.PaymentDTO;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PatientPaymentProxy {

    @GetMapping("/payment/get-patient-payments")
    List<PaymentDTO> getPatientPayments(@RequestParam Long patientId);

}
