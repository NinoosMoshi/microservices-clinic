package com.ninos.patient.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.patient.service.PatientService;

@RequiredArgsConstructor
@RestController
@Slf4j
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/search/{name}")
    public String getName(@PathVariable String name){
        log.info("new request: " + UUID.randomUUID());
        return patientService.getName(name);
    }

}
