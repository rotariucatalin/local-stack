package com.ls.localstack.service;

import com.ls.localstack.dto.PatientDTO;
import com.ls.localstack.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<PatientDTO> findAll() {
        return patientRepository.findAll()
                .stream()
                .map(patient -> new PatientDTO(
                        patient.getName(),
                        patient.getEmail(),
                        patient.getAddress(),
                        patient.getDateOfBirth().toString(),
                        patient.getRegisteredDate().toString()
                ))
                .collect(Collectors.toList());
    }
}
