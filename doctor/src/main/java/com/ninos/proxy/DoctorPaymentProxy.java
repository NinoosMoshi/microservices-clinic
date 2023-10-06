package com.ninos.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ninos.model.dto.PaymentDTO;

@FeignClient(name = "PAYMENT-SERVICE")
public interface DoctorPaymentProxy {


    @GetMapping("/payment/payment-by-trans")
    PaymentDTO getPaymentById(@RequestParam String transId);


    @PostMapping("/payment/add-payment")
    PaymentDTO addNewPayment(@RequestBody PaymentDTO paymentDTO);

}
