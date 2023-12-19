package com.ihormanzii.monobankcurrencychecker.services;

import com.ihormanzii.monobankcurrencychecker.feign.dto.CurrencyDTO;

import java.util.List;

public interface CurrencyService {
    List<CurrencyDTO> getCurrency();
}
