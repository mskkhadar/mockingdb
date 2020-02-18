package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * List of items
 */

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigParamResponseInputCriteria {
	@JsonProperty("name")
	private String name;

	@JsonProperty("minValue")
	private String minValue;

	@JsonProperty("maxValue")
	private String maxValue;

	@JsonProperty("defaultValue")
	private String defaultValue;
	
	@JsonProperty("possibleValues")
	@Valid
	private List<Object> possibleValues;
	
	@JsonProperty("unit")
	private String unit;

	@JsonProperty("mandatory")
	private Boolean mandatory;
	
	@JsonProperty("recalculationRequired")
	private Boolean recalculationRequired;

}
