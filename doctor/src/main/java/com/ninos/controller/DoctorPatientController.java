package com.ninos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.PatientDTO;
import com.ninos.service.DoctorPatientService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/doctor-patient")
public class DoctorPatientController {

    private final DoctorPatientService doctorPatientService;


    @GetMapping("/patient/{id}")
    public PatientDTO getPatientFromPatientMS(@PathVariable Long id){
        return doctorPatientService.getPatient(id);
    }


    @PostMapping("/add-patient")
    public PatientDTO addNewPatient(@RequestBody PatientDTO patientDTO){
        return doctorPatientService.addPatient(patientDTO);
    }


//    @GetMapping("/doctor/get-patient")
//    public String getPatientName(){
//       return doctorPatientService.getPatient("ninos");
//    }



//    @GetMapping("/doctor/get-patient-proxy")
//    public String getPatientNameByProxy(@RequestParam String name){
//        return doctorPatientService.getPatient(name);
//    }

}
