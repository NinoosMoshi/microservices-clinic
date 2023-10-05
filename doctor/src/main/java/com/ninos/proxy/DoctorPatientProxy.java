package com.ninos.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ninos.model.dto.PatientDTO;

@FeignClient(name = "PATIENT-SERVICE")
public interface DoctorPatientProxy {

    @GetMapping("/search/{name}")
    String getName(@PathVariable String name);

    @GetMapping("/get/{patientId}")
    PatientDTO getPatientById(@PathVariable("patientId") Long id);

    @PostMapping("/save")
    PatientDTO save(@RequestBody PatientDTO patientDTO);

}
