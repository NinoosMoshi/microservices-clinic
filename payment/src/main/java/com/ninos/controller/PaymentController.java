package com.ninos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.PaymentDTO;
import com.ninos.service.PaymentService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;


    @GetMapping("/payment-by-trans")
    public PaymentDTO getPaymentById(@RequestParam String transId){
        return paymentService.getPayment(transId);
    }


    @PostMapping("/add-payment")
    public PaymentDTO addNewPayment(@RequestBody PaymentDTO paymentDTO){
        return paymentService.addPayment(paymentDTO);
    }


}
