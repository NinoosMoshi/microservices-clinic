package com.ninos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.PaymentDTO;
import com.ninos.service.DoctorPaymentService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/doctor-payment")
public class DoctorPaymentController {

    private final DoctorPaymentService doctorPaymentService;


    @PostMapping("/add-payment")
    public PaymentDTO addPayment(@RequestBody PaymentDTO paymentDTO){
        return doctorPaymentService.addPayment(paymentDTO);
    }


    @GetMapping("/payment-by-transId")
    public PaymentDTO getPaymentByTransId(@RequestParam String transId){
        return doctorPaymentService.getPayment(transId);
    }

}
