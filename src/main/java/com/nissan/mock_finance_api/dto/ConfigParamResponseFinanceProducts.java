package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.ConfigParamResponseInputCriteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * List of items(vehical specifications)
 */

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigParamResponseFinanceProducts {
	@JsonProperty("name")
	private String name;

	@JsonProperty("code")
	private String code;

	@JsonProperty("description")
	private String description;

	@JsonProperty("disclaimer")
	private String disclaimer;

	@JsonProperty("default")
	private Boolean _default;

	@JsonProperty("inputCriteria")
	@Valid
	private List<ConfigParamResponseInputCriteria> inputItems = new ArrayList<ConfigParamResponseInputCriteria>();

	
}
