package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinanceCalcFees
 */
@Validated

public class FinanceCalcFees {
	@JsonProperty("feeType")
	private String feeType;

	@JsonProperty("desc")
	private String desc;

	@JsonProperty("fee")
	private BigDecimal fee;

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public FinanceCalcFees(String feeType, String desc, BigDecimal fee) {
		super();
		this.feeType = feeType;
		this.desc = desc;
		this.fee = fee;
	}

}
