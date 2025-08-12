package com.bloodbank.controller;

import com.bloodbank.model.Bank;
import com.bloodbank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BBankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/storage")
    public List<Bank> getAllStorage(){
        return bankService.getBanks();
    }
}
