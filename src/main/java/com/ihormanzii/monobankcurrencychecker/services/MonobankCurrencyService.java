package com.ihormanzii.monobankcurrencychecker.services;

import com.ihormanzii.monobankcurrencychecker.feign.clients.MonobankClient;
import com.ihormanzii.monobankcurrencychecker.feign.dto.CurrencyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MonobankCurrencyService implements CurrencyService {

    @Autowired
    private MonobankClient monobankClient;

    @Override
    public List<CurrencyDTO> getCurrency() {
        log.info("Getting currency");

        return monobankClient.getCurrency();
    }

}
