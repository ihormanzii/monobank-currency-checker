package com.ihormanzii.monobankcurrencychecker.feign.clients;

import com.ihormanzii.monobankcurrencychecker.feign.config.FeignConfig;
import com.ihormanzii.monobankcurrencychecker.feign.dto.CurrencyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "monobank", url = "https://api.monobank.ua", configuration = FeignConfig.class)
public interface MonobankClient {

    @GetMapping(path = "/bank/currency")
    List<CurrencyDTO> getCurrency();
}
