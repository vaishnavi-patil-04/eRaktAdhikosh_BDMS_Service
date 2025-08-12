package com.bloodbank.service;

import com.bloodbank.model.Bank;
import com.bloodbank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;
    public List<Bank> getBanks(){
        return bankRepository.getBanks();
    }
}
