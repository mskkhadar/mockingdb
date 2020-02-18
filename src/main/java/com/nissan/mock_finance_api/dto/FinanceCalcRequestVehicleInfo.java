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
 * Information about the vehicle
 */

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinanceCalcRequestVehicleInfo   {
  @JsonProperty("modelCode")
  private String modelCode ;

  @JsonProperty("gradeId")
  private String gradeId ;

  @JsonProperty("versionId")
  private String versionId ;

  @JsonProperty("eimCode")
  private String eimCode ;

  @JsonProperty("colour")
  private String colour ;

  @JsonProperty("mileage")
  private int mileage ;

   
}
