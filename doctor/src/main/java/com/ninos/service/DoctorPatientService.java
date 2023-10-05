package com.ninos.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ninos.model.dto.PatientDTO;
import com.ninos.proxy.DoctorPatientProxy;

@RequiredArgsConstructor
@Service
public class DoctorPatientService {

    private final DoctorPatientProxy doctorPatientProxy;

    public PatientDTO getPatient(Long id){
        return doctorPatientProxy.getPatientById(id);
    }


    public PatientDTO addPatient(PatientDTO patientDTO){
       return doctorPatientProxy.save(patientDTO);
    }


//    public String getPatient(String name){
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("http://localhost:9000/search/" + name, String.class);
//    }


//    public String getPatientByFeignClient(String name){
//       return doctorPatientProxy.getName(name);
//    }





}
