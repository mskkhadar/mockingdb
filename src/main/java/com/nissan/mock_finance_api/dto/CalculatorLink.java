package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
/**
 * CalculatorLink
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CalculatorLink {
	@JsonProperty("url")
	private String url ;

	
	
}
