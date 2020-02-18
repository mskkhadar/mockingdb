package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestFinanceInfo;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestLocationInfo;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestVehicleInfo;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The finance API provides a calculator to return indicative loan repayments
 * based on user input and vehicle values. Note that price values are processed
 * as-is i.e. values are sent to the downstream system as they are received. No
 * currency conversion occurs and the price value that is processed to generate
 * the repayments data in the response is used as it is received.
 */

@Validated

public class FinanceCalcRequest {
	@JsonProperty("vehicleInfo")
	private FinanceCalcRequestVehicleInfo vehicleInfo;

	@JsonProperty("financeInfo")
	private FinanceCalcRequestFinanceInfo financeInfo;

	@JsonProperty("locationInfo")
	private FinanceCalcRequestLocationInfo locationInfo;

	@JsonProperty("returnCompleteResponse")
	private Boolean returnCompleteResponse;

	public FinanceCalcRequestVehicleInfo getVehicleInfo() {
		return vehicleInfo;
	}

	public void setVehicleInfo(FinanceCalcRequestVehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public FinanceCalcRequestFinanceInfo getFinanceInfo() {
		return financeInfo;
	}

	public void setFinanceInfo(FinanceCalcRequestFinanceInfo financeInfo) {
		this.financeInfo = financeInfo;
	}

	public FinanceCalcRequestLocationInfo getLocationInfo() {
		return locationInfo;
	}

	public void setLocationInfo(FinanceCalcRequestLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public Boolean getReturnCompleteResponse() {
		return returnCompleteResponse;
	}

	public void setReturnCompleteResponse(Boolean returnCompleteResponse) {
		this.returnCompleteResponse = returnCompleteResponse;
	}

	public FinanceCalcRequest(FinanceCalcRequestVehicleInfo vehicleInfo, FinanceCalcRequestFinanceInfo financeInfo,
			FinanceCalcRequestLocationInfo locationInfo, Boolean returnCompleteResponse) {
		super();
		this.vehicleInfo = vehicleInfo;
		this.financeInfo = financeInfo;
		this.locationInfo = locationInfo;
		this.returnCompleteResponse = returnCompleteResponse;
	}

}
