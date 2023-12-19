package com.ihormanzii.monobankcurrencychecker.controller;


import com.ihormanzii.monobankcurrencychecker.feign.dto.CurrencyDTO;
import com.ihormanzii.monobankcurrencychecker.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/currency")
    public List<CurrencyDTO> getCurrency() {
        return currencyService.getCurrency();
    }
}
