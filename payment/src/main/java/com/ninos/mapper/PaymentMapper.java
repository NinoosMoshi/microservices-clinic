package com.ninos.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.ninos.model.dto.PaymentDTO;
import com.ninos.model.entity.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDTO toDTO(Payment payment);

    Payment toEntity(PaymentDTO paymentDTO);

}
