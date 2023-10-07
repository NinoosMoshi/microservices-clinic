package com.ninos.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ninos.model.dto.PaymentDTO;

@FeignClient(name = "PAYMENT-SERVICE", path = "/payment")  // means code below:
public interface DoctorPaymentProxy {


    @GetMapping("/payments/payment-by-trans")           // /payment/payments/payment-by-trans
    PaymentDTO getPaymentById(@RequestParam String transId);


    @PostMapping("/payments/add-payment")               // /payment/payments/add-payment
    PaymentDTO addNewPayment(@RequestBody PaymentDTO paymentDTO);

}
