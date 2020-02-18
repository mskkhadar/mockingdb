package com.nissan.mock_finance_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import org.springframework.validation.annotation.Validated;

/**
 * Total
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Total   {
  @JsonProperty("code")
  private String code ;

  @JsonProperty("label")
  private String label ;

  @JsonProperty("value")
  private int value ;

  
}
