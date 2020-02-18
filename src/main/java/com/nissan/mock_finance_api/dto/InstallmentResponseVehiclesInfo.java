package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.InstallmentResponseFinanceInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;



import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstallmentResponseVehiclesInfo
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InstallmentResponseVehiclesInfo   {
  @JsonProperty("code")
  private String code ;

  @JsonProperty("gradeKey")
  private String gradeKey ;

  @JsonProperty("versionKey")
  private String versionKey ;

  @JsonProperty("eimCode")
  private String eimCode ;

  @JsonProperty("colour")
  private String colour ;

  @JsonProperty("defaultValuesUsed")
  private Boolean defaultValuesUsed ;

  @JsonProperty("repaymentPrice")
  private BigDecimal repaymentPrice ;

  @JsonProperty("financeInfo")
  private InstallmentResponseFinanceInfo financeInfo ;

  
}
