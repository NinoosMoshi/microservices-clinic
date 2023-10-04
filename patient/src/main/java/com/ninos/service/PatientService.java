package com.ninos.patient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

    List<String> names = Arrays.asList("ninos", "nahrain", "matthew", "daniel");

    public String getName(String name){
        return names.stream().filter(n -> n.equals(name))
                .findAny().orElse("Patient not found");
    }

}
