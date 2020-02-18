package com.nissan.mock_finance_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nissan.mock_finance_api.dto.Taxes;
import com.nissan.mock_finance_api.mock_samples.DtoMocker;

@SpringBootApplication
public class MockFinanceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockFinanceApiApplication.class, args);
		DtoMocker obj = new DtoMocker();
		
		Taxes obj2 =  obj.getTaxes();
		System.out.println(obj2.getCurrency() + " " + obj2.getCategories() + " " +  obj2.getTotal());
	}

}
