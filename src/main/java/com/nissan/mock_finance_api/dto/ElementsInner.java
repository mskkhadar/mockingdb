package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElementsInner
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ElementsInner {
	@JsonProperty("code")
	private String code;

	@JsonProperty("label")
	private String label;

	@JsonProperty("value")
	private int value;

	

}
