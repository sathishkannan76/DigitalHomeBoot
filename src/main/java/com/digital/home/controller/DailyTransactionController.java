package com.digital.home.controller;

import com.digital.home.model.DailyTransaction;
import com.digital.home.service.DailyTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyTransactionController {

    @Autowired
    private DailyTransactionService dailyTransactionService;

    @GetMapping("/daily-transactions/{projectId}")
    public DailyTransaction getDailyTransaction(@PathVariable(value = "projectId") Long projectId) {
        return dailyTransactionService.getDailyTransactionDetails(projectId);
    }

}
