package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about user location
 */

@Validated

public class FinanceCalcRequestLocationInfo {
	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("zone")
	private String zone;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public FinanceCalcRequestLocationInfo(String postalCode, String zone) {
		super();
		this.postalCode = postalCode;
		this.zone = zone;
	}

}
