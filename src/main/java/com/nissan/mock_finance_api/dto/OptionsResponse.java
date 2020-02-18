package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConfigParamResponse
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionsResponse {
	@JsonProperty("financeType")
	@Valid
	private List<ConfigParamResponseFinanceType> financeType = new ArrayList<ConfigParamResponseFinanceType>();
}
