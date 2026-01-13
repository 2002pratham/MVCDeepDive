package com.igreaper.MVCflow.controller;

import com.igreaper.MVCflow.dto.EmployeeDTO;
import com.igreaper.MVCflow.entities.EmployeeEntity;
import com.igreaper.MVCflow.repositories.EmployeeRepository;
import com.igreaper.MVCflow.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeDTO employeeDTO;
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeDTO employeeDTO, EmployeeService employeeService) {
        this.employeeDTO = employeeDTO;
        this.employeeService = employeeService;

    }


    @GetMapping("/{employeesID}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeesID") Integer id){
        return employeeService.getEmployeeById(id);

    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age,
                                                  @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeDTO);
    }

}
