package com.igreaper.MVCflow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private String email;
    private int id;
    private LocalDateTime dateOfJoining;
    private int Age;

    public EmployeeDTO(String pratham, String mail, int id, int i, int age) {
        this.name = name;
        this.email = mail;
        this.id = id;
        this.Age = i;
        this.dateOfJoining = LocalDateTime.now();
    }
}
