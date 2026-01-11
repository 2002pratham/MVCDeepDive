package com.igreaper.MVCflow.controller;

import com.igreaper.MVCflow.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @GetMapping("/{employeesID}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeesID") Long id){
         return new EmployeeDTO("Pratham","prathams1334@gmail.com",1, 17,24 );
    }

    @GetMapping
    public String getEmployeesByAge(@RequestParam(required = false) Integer age,
                                    @RequestParam(required = false) String sortBy){
        return "Hy my age" + " " + age + " "+  sortBy;
    }

    @PostMapping("/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeDTO.setId(100);
        return employeeDTO;
    }

}
