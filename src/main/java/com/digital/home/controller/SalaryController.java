package com.digital.home.controller;

import com.digital.home.model.MaterialCostDetails;
import com.digital.home.model.SalaryDetails;
import com.digital.home.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class SalaryController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/salary/{projectId}")
    public SalaryDetails getSalaryDetails(@PathVariable(name = "projectId") Long projectId,
                                          @RequestParam(name = "fromDate")
                                          @DateTimeFormat(pattern = "dd.MM.yyyy") Date fromDate,
                                          @RequestParam(name = "toDate")
                                          @DateTimeFormat(pattern = "dd.MM.yyyy") Date toDate) {
        return paymentService.getSalaryDetails(projectId, fromDate, toDate);
    }

    @GetMapping("/material-costs/{projectId}")
    public MaterialCostDetails getMaterialCostDetails(@PathVariable(name = "projectId") Long projectId,
                                                      @RequestParam(name = "fromDate")
                                          @DateTimeFormat(pattern = "dd.MM.yyyy") Date fromDate,
                                                      @RequestParam(name = "toDate")
                                          @DateTimeFormat(pattern = "dd.MM.yyyy") Date toDate) {
        return paymentService.getMaterialCostDetails(projectId, fromDate, toDate);
    }

}
