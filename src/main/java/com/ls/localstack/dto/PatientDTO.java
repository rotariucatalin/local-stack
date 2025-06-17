package com.ls.localstack.dto;

public record PatientDTO(String name,
                         String email,
                         String address,
                         String dateOfBirth,
                         String registeredDate) {
}
