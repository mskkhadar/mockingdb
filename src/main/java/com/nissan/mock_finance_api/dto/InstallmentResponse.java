package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.InstallmentResponseVehiclesInfo;

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
 * InstallmentResponse
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentResponse   {
  @JsonProperty("vehiclesInfo")
  @Valid
  private List<InstallmentResponseVehiclesInfo> vehiclesInfo = new ArrayList<InstallmentResponseVehiclesInfo>();

  
}
