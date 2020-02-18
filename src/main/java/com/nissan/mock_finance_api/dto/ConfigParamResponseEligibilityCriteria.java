package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceProducts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConfigParamResponseEligibilityCriteria
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigParamResponseEligibilityCriteria   {
  @JsonProperty("name")
  private String name ;

  @JsonProperty("default")
  private Boolean _default;

  @JsonProperty("financeProducts")
  @Valid
  private List<ConfigParamResponseFinanceProducts> financeProducts = new ArrayList<ConfigParamResponseFinanceProducts>();

}
