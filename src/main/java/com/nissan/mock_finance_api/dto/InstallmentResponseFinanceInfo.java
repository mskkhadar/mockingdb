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
 * InstallmentResponseFinanceInfo
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InstallmentResponseFinanceInfo   {
  @JsonProperty("type")
  private String type ;

  @JsonProperty("productCode")
  private String productCode ;

  @JsonProperty("eligibility")
  private String eligibility ;

  @JsonProperty("deposit")
  private BigDecimal deposit ;

  @JsonProperty("tradeIn")
  private BigDecimal tradeIn ;

  @JsonProperty("term")
  private Integer term ;

  @JsonProperty("mileage")
  private Integer mileage ;

  @JsonProperty("baloon")
  private Integer baloon ;

  @JsonProperty("interestRate")
  private BigDecimal interestRate ;

  @JsonProperty("repaymentFrequency")
  private String repaymentFrequency ;

  
}
