package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about finance options
 */

@Validated

public class FinanceCalcRequestFinanceInfo {
	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("purchasePrice")
	private BigDecimal purchasePrice;

	@JsonProperty("basePrice")
	private BigDecimal basePrice;

	@JsonProperty("colourPrice")
	private BigDecimal colourPrice;

	@JsonProperty("deposit")
	private BigDecimal deposit;

	@JsonProperty("term")
	private BigDecimal term;

	@JsonProperty("eligibility")
	private String eligibility;

	@JsonProperty("termUnit")
	private String termUnit;

	@JsonProperty("paymentFrequency")
	private String paymentFrequency;

	@JsonProperty("balloon")
	private BigDecimal balloon;

	@JsonProperty("interestRate")
	private BigDecimal interestRate;

	@JsonProperty("financeType")
	private String financeType;

	@JsonProperty("tradeIn")
	private BigDecimal tradeIn;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getColourPrice() {
		return colourPrice;
	}

	public void setColourPrice(BigDecimal colourPrice) {
		this.colourPrice = colourPrice;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getTerm() {
		return term;
	}

	public void setTerm(BigDecimal term) {
		this.term = term;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String getTermUnit() {
		return termUnit;
	}

	public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public BigDecimal getBalloon() {
		return balloon;
	}

	public void setBalloon(BigDecimal balloon) {
		this.balloon = balloon;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public String getFinanceType() {
		return financeType;
	}

	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}

	public BigDecimal getTradeIn() {
		return tradeIn;
	}

	public void setTradeIn(BigDecimal tradeIn) {
		this.tradeIn = tradeIn;
	}

	public FinanceCalcRequestFinanceInfo(String productCode, BigDecimal purchasePrice, BigDecimal basePrice,
			BigDecimal colourPrice, BigDecimal deposit, BigDecimal term, String eligibility, String termUnit,
			String paymentFrequency, BigDecimal balloon, BigDecimal interestRate, String financeType,
			BigDecimal tradeIn) {
		super();
		this.productCode = productCode;
		this.purchasePrice = purchasePrice;
		this.basePrice = basePrice;
		this.colourPrice = colourPrice;
		this.deposit = deposit;
		this.term = term;
		this.eligibility = eligibility;
		this.termUnit = termUnit;
		this.paymentFrequency = paymentFrequency;
		this.balloon = balloon;
		this.interestRate = interestRate;
		this.financeType = financeType;
		this.tradeIn = tradeIn;
	}

}
