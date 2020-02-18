package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.Elements;
import com.nissan.mock_finance_api.dto.TaxesSubCategories;
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
 * TaxesCategories
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxesCategories   {
  @JsonProperty("code")
  private String code ;

  @JsonProperty("title")
  private String title ;

  @JsonProperty("subCategories")
  @Valid
  private List<TaxesSubCategories> subCategories ;

  @JsonProperty("elements")
  private Elements elements ;

 
}
