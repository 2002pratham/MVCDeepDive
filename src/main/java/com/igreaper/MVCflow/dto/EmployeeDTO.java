package com.igreaper.MVCflow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private int Age;

    public EmployeeDTO(Long id, String n, String mail, int i, int age) {
        this.id = id;
        this.name = n;
        this.email = mail;
        this.Age = i;
    }
}
