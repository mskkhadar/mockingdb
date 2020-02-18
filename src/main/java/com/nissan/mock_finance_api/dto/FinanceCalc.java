package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nissan.mock_finance_api.dto.FinanceCalcRepayments;
import com.nissan.mock_finance_api.dto.FinanceCalcStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

public class FinanceCalc {
	@JsonProperty("purchaseTotal")
	private BigDecimal purchaseTotal;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("interestRate")
	private BigDecimal interestRate;

	@JsonProperty("containsOfferRate")
	private Boolean containsOfferRate;

	@JsonProperty("offerCode")
	private String offerCode;

	@JsonProperty("offerDescription")
	private String offerDescription;

	@JsonProperty("deposit")
	private BigDecimal deposit;

	@JsonProperty("loanPeriodMonths")
	private Integer loanPeriodMonths;

	@JsonProperty("balloon")
	private BigDecimal balloon;

	/**
	 * The caller may request finance,lease or best price. The price returned will
	 * always have a value of finance or lease.
	 */
	public enum FinanceTypeEnum {
		FINANCE("finance"),

		LEASE("lease"),

		BEST("best");

		private String value;

		FinanceTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static FinanceTypeEnum fromValue(String text) {
			for (FinanceTypeEnum b : FinanceTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("financeType")
	private FinanceTypeEnum financeType;

	@JsonProperty("nissanDeposit")
	private BigDecimal nissanDeposit;

	@JsonProperty("registrationCost")
	private BigDecimal registrationCost;

	@JsonProperty("insuranceCost")
	private BigDecimal insuranceCost;

	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("repayments")
	@Valid
	private List<FinanceCalcRepayments> repayments = new ArrayList<FinanceCalcRepayments>();

	@JsonProperty("status")
	private FinanceCalcStatus status;

	public BigDecimal getPurchaseTotal() {
		return purchaseTotal;
	}

	public void setPurchaseTotal(BigDecimal purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public Boolean getContainsOfferRate() {
		return containsOfferRate;
	}

	public void setContainsOfferRate(Boolean containsOfferRate) {
		this.containsOfferRate = containsOfferRate;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public Integer getLoanPeriodMonths() {
		return loanPeriodMonths;
	}

	public void setLoanPeriodMonths(Integer loanPeriodMonths) {
		this.loanPeriodMonths = loanPeriodMonths;
	}

	public BigDecimal getBalloon() {
		return balloon;
	}

	public void setBalloon(BigDecimal balloon) {
		this.balloon = balloon;
	}

	public FinanceTypeEnum getFinanceType() {
		return financeType;
	}

	public void setFinanceType(FinanceTypeEnum financeType) {
		this.financeType = financeType;
	}

	public BigDecimal getNissanDeposit() {
		return nissanDeposit;
	}

	public void setNissanDeposit(BigDecimal nissanDeposit) {
		this.nissanDeposit = nissanDeposit;
	}

	public BigDecimal getRegistrationCost() {
		return registrationCost;
	}

	public void setRegistrationCost(BigDecimal registrationCost) {
		this.registrationCost = registrationCost;
	}

	public BigDecimal getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(BigDecimal insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<FinanceCalcRepayments> getRepayments() {
		return repayments;
	}

	public void setRepayments(List<FinanceCalcRepayments> repayments) {
		this.repayments = repayments;
	}

	public FinanceCalcStatus getStatus() {
		return status;
	}

	public void setStatus(FinanceCalcStatus status) {
		this.status = status;
	}

	public FinanceCalc(BigDecimal purchaseTotal, String currency, BigDecimal interestRate, Boolean containsOfferRate,
			String offerCode, String offerDescription, BigDecimal deposit, Integer loanPeriodMonths, BigDecimal balloon,
			FinanceTypeEnum financeType, BigDecimal nissanDeposit, BigDecimal registrationCost,
			BigDecimal insuranceCost, String productCode, @Valid List<FinanceCalcRepayments> repayments,
			FinanceCalcStatus status) {
		super();
		this.purchaseTotal = purchaseTotal;
		this.currency = currency;
		this.interestRate = interestRate;
		this.containsOfferRate = containsOfferRate;
		this.offerCode = offerCode;
		this.offerDescription = offerDescription;
		this.deposit = deposit;
		this.loanPeriodMonths = loanPeriodMonths;
		this.balloon = balloon;
		this.financeType = financeType;
		this.nissanDeposit = nissanDeposit;
		this.registrationCost = registrationCost;
		this.insuranceCost = insuranceCost;
		this.productCode = productCode;
		this.repayments = repayments;
		this.status = status;
	}

}
