package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;


import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstallmentRequestVehiclesInfo
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InstallmentRequestVehiclesInfo   {
  @JsonProperty("modelCode")
  private String modelCode ;

  @JsonProperty("priceCode")
  private String priceCode ;

  
}
