package com.ihormanzii.monobankcurrencychecker.feign.dto;

import lombok.Data;

@Data
public class CurrencyDTO {
    private Integer currencyCodeA;
    private Integer currencyCodeB;
    private Long date;
    private Double rateSell;
    private Double rateBuy;
    private Double rateCross;
}
