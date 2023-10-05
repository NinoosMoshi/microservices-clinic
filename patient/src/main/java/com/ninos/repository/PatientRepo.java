package com.ninos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninos.model.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Long> {
}
