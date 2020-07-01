package com.digital.home.controller;

import com.digital.home.model.DailyTransaction;
import com.digital.home.model.SalaryDetails;
import com.digital.home.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/salary/{projectId}")
    public SalaryDetails getSalaryDetails(@PathVariable(value = "projectId") Long projectId) {
        return salaryService.getSalaryDetails(projectId);
    }

}
