package com.ninos.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.UuidGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {

    private Long paymentId;

    private String transId;
    private Double amount;
    private Long patientId;

}
