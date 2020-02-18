package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.TaxesCategories;
import com.nissan.mock_finance_api.dto.Total;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;



import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Taxes
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Taxes   {
  @JsonProperty("currency")
  private String currency ;

  @JsonProperty("categories")
  @Valid
  private List<TaxesCategories> categories = new ArrayList<TaxesCategories>();

  @JsonProperty("total")
  private Total total ;

  
}
