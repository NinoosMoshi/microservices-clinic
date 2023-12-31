package com.ninos.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.PatientDTO;
import com.ninos.model.dto.PaymentDTO;
import com.ninos.service.PaymentService;
import com.ninos.service.PatientService;


@RequiredArgsConstructor
@RestController
@Slf4j
public class PatientController {

    private final PatientService patientService;

    private final PaymentService paymentService;

    @PostMapping("/save")
    public PatientDTO save(@RequestBody PatientDTO patientDTO){
        return patientService.savePatient(patientDTO);
    }


    @PutMapping("/update")
    public PatientDTO update(@RequestBody PatientDTO patientDTO){
        return patientService.updatePatient(patientDTO);
    }


    @GetMapping("/get/{patientId}")
    public PatientDTO getPatientById(@PathVariable("patientId") Long id){
        return patientService.getPatient(id);
    }

    @DeleteMapping("/delete/{patientId}")
    public void deletePatient(@PathVariable("patientId") Long id){
        patientService.deletePatient(id);
    }


    @GetMapping("/get-patient-payments")
    public List<PaymentDTO> getAllPayments(@RequestParam Long patientId){
       return paymentService.getAllPatientPayments(patientId);
    }



}
