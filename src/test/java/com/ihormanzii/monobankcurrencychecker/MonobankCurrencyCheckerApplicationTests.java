package com.ihormanzii.monobankcurrencychecker;

import com.ihormanzii.monobankcurrencychecker.feign.dto.CurrencyDTO;
import com.ihormanzii.monobankcurrencychecker.services.CurrencyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MonobankCurrencyCheckerApplicationTests {

	@Autowired
	private CurrencyService currencyService;

	@Test
	void getCurrencyTest() {
		List<CurrencyDTO> currency = currencyService.getCurrency();

		assertThat(currency)
				.isNotNull()
				.isNotEmpty();
	}

}
