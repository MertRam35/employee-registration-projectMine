package com.mert.controller;

import com.mert.bootstrap.DataGenerator;
import com.mert.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee",new Employee());

model.addAttribute("stateList", DataGenerator.getAllStates());

        return "employee/employeeCreate";
    }


}
