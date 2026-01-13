package com.igreaper.MVCflow.controller;

import com.igreaper.MVCflow.dto.EmployeeDTO;
import com.igreaper.MVCflow.entities.EmployeeEntity;
import com.igreaper.MVCflow.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/{employeesID}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeesID") Integer id){
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getEmployeesByAge(@RequestParam(required = false) Integer age,
                                                  @RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();
    }

    @PostMapping("/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

}
