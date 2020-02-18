package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.Elements;
import com.nissan.mock_finance_api.dto.Total;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;



import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxesSubCategories
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaxesSubCategories   {
  @JsonProperty("code")
  private String code ;

  @JsonProperty("total")
  private Total total ;

  @JsonProperty("elements")
  private Elements elements ;

  
}
