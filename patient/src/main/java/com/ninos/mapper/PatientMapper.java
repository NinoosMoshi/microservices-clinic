package com.ninos.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ninos.model.dto.PatientDTO;
import com.ninos.model.entity.Patient;

@Service
public class PatientMapper {


    public Patient dtoToEntity(PatientDTO patientDTO){
          Patient patient = new Patient();
          BeanUtils.copyProperties(patientDTO, patient);
          return patient;
      }


    public PatientDTO entityToDto(Patient patient){
        PatientDTO patientDTO = new PatientDTO();
        BeanUtils.copyProperties(patient, patientDTO);
        return patientDTO;
    }



}
