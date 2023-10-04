package com.ninos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.service.DoctorPatientService;

@RequiredArgsConstructor
@RestController
public class DoctorPatientController {

    private final DoctorPatientService doctorPatientService;

    @GetMapping("/doctor/get-patient")
    public String getPatientName(){
       return doctorPatientService.getPatient("kk");
    }

}
