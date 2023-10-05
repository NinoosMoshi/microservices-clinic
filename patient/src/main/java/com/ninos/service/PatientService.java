package com.ninos.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ninos.mapper.PatientMapper;
import com.ninos.model.dto.PatientDTO;
import com.ninos.model.entity.Patient;
import com.ninos.repository.PatientRepo;

@RequiredArgsConstructor
@Service
public class PatientService {

    private final PatientRepo patientRepo;
    private final PatientMapper patientMapper;


    List<String> names = Arrays.asList("ninos", "nahrain", "matthew", "daniel");

    public String getName(String name){
        return names.stream().filter(n -> n.equals(name))
                .findAny().orElse("Patient not found");
    }


    public PatientDTO savePatient(PatientDTO patientDTO){
        Patient patient = patientMapper.dtoToEntity(patientDTO);
        Patient savedPatient = patientRepo.save(patient);

        return patientMapper.entityToDto(savedPatient);
    }


    public PatientDTO updatePatient(PatientDTO patientDTO){
       Patient patient = patientRepo.findById(patientDTO.getPatientId())
               .orElseThrow(() -> new EntityNotFoundException("Patient With ID " + patientDTO.getPatientId() + " Not Found"));

       patient.setPatientName(patientDTO.getPatientName());
       patient.setPatientAge(patientDTO.getPatientAge());
       Patient updatedPatient = patientRepo.save(patient);

       return patientMapper.entityToDto(updatedPatient);
    }



    public PatientDTO getPatient(Long patientId){
        Patient patient = patientRepo.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient With ID " + patientId + " Not Found"));

        return patientMapper.entityToDto(patient);
    }



    public void deletePatient(Long patientId){
        Patient patient = patientRepo.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient With ID " + patientId + " Not Found"));
        patientRepo.deleteById(patientId);
    }




}
