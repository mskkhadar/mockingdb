package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nissan.mock_finance_api.dto.FinanceCalcFees;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinanceCalcRepayments
 */
@Validated

public class FinanceCalcRepayments {
	@JsonProperty("frequency")
	private String frequency;

	@JsonProperty("intervalPayment")
	private BigDecimal intervalPayment;

	@JsonProperty("totalInterestPaid")
	private BigDecimal totalInterestPaid;

	@JsonProperty("totalPaidOverLoan")
	private BigDecimal totalPaidOverLoan;

	@JsonProperty("balloonRepayment")
	private BigDecimal balloonRepayment;

	@JsonProperty("totalFees")
	private BigDecimal totalFees;

	@JsonProperty("totalCreditAmount")
	private BigDecimal totalCreditAmount;

	@JsonProperty("optionalFinalPayment")
	private BigDecimal optionalFinalPayment;

	@JsonProperty("fees")
	@Valid
	private List<FinanceCalcFees> fees;

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getIntervalPayment() {
		return intervalPayment;
	}

	public void setIntervalPayment(BigDecimal intervalPayment) {
		this.intervalPayment = intervalPayment;
	}

	public BigDecimal getTotalInterestPaid() {
		return totalInterestPaid;
	}

	public void setTotalInterestPaid(BigDecimal totalInterestPaid) {
		this.totalInterestPaid = totalInterestPaid;
	}

	public BigDecimal getTotalPaidOverLoan() {
		return totalPaidOverLoan;
	}

	public void setTotalPaidOverLoan(BigDecimal totalPaidOverLoan) {
		this.totalPaidOverLoan = totalPaidOverLoan;
	}

	public BigDecimal getBalloonRepayment() {
		return balloonRepayment;
	}

	public void setBalloonRepayment(BigDecimal balloonRepayment) {
		this.balloonRepayment = balloonRepayment;
	}

	public BigDecimal getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(BigDecimal totalFees) {
		this.totalFees = totalFees;
	}

	public BigDecimal getTotalCreditAmount() {
		return totalCreditAmount;
	}

	public void setTotalCreditAmount(BigDecimal totalCreditAmount) {
		this.totalCreditAmount = totalCreditAmount;
	}

	public BigDecimal getOptionalFinalPayment() {
		return optionalFinalPayment;
	}

	public void setOptionalFinalPayment(BigDecimal optionalFinalPayment) {
		this.optionalFinalPayment = optionalFinalPayment;
	}

	public List<FinanceCalcFees> getFees() {
		return fees;
	}

	public void setFees(List<FinanceCalcFees> fees) {
		this.fees = fees;
	}

	public FinanceCalcRepayments(String frequency, BigDecimal intervalPayment, BigDecimal totalInterestPaid,
			BigDecimal totalPaidOverLoan, BigDecimal balloonRepayment, BigDecimal totalFees,
			BigDecimal totalCreditAmount, BigDecimal optionalFinalPayment, @Valid List<FinanceCalcFees> fees) {
		super();
		this.frequency = frequency;
		this.intervalPayment = intervalPayment;
		this.totalInterestPaid = totalInterestPaid;
		this.totalPaidOverLoan = totalPaidOverLoan;
		this.balloonRepayment = balloonRepayment;
		this.totalFees = totalFees;
		this.totalCreditAmount = totalCreditAmount;
		this.optionalFinalPayment = optionalFinalPayment;
		this.fees = fees;
	}

}
