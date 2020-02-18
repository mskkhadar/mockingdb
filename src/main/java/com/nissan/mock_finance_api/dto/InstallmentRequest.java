package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.InstallmentRequestFinanceInfo;
import com.nissan.mock_finance_api.dto.InstallmentRequestVehiclesInfo;

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
 * InstallmentRequest
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InstallmentRequest   {
  @JsonProperty("financeInfo")
  private InstallmentRequestFinanceInfo financeInfo ;

  @JsonProperty("postalCode")
  private String postalCode ;

  @JsonProperty("zone")
  private String zone ;

  @JsonProperty("includeGradeVersion")
  private Boolean includeGradeVersion ;

  @JsonProperty("vehiclesInfo")
  @Valid
  private List<InstallmentRequestVehiclesInfo> vehiclesInfo = new ArrayList<InstallmentRequestVehiclesInfo>();

  
}
