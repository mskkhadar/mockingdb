package com.nissan.mock_finance_api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nissan.mock_finance_api.mock_samples.SampleData.FinanceTypeEnum;

import lombok.Data;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A finance offer contains the information displayed to the user regarding a
 * finance or lease offer. All labels and text are expected to be returned
 * localised for the market.
 */

@Validated
@Data
public class Finance {
	@JsonProperty("label")
	private String label;

	@JsonProperty("price")
	private int price;

	@JsonProperty("monthlyPayment")
	private int monthlyPayment;

	@JsonProperty("months")
	private int months;

	@JsonProperty("currency")
	private String currency;



	@JsonProperty("financeType")
	private FinanceTypeEnum financeType;

	@JsonProperty("heading")
	private String heading;

	@JsonProperty("subHeading")
	private String subHeading;

	@JsonProperty("text")
	private String text;

	@JsonProperty("legalText")
	private String legalText;

	@JsonProperty("warning")
	private String warning;

	
	
	public Finance(String label, int price, int monthlyPayment, int months, String currency,
			FinanceTypeEnum financeType, String heading, String subHeading, String text, String legalText,
			String warning) {
		super();
		this.label = label;
		this.price = price;
		this.monthlyPayment = monthlyPayment;
		this.months = months;
		this.currency = currency;
		this.financeType = financeType;
		this.heading = heading;
		this.subHeading = subHeading;
		this.text = text;
		this.legalText = legalText;
		this.warning = warning;
	}



	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getMonthlyPayment() {
		return monthlyPayment;
	}



	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}



	public int getMonths() {
		return months;
	}



	public void setMonths(int months) {
		this.months = months;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public FinanceTypeEnum getFinanceType() {
		return financeType;
	}



	public void setFinanceType(FinanceTypeEnum financeType) {
		this.financeType = financeType;
	}



	public String getHeading() {
		return heading;
	}



	public void setHeading(String heading) {
		this.heading = heading;
	}



	public String getSubHeading() {
		return subHeading;
	}



	public void setSubHeading(String subHeading) {
		this.subHeading = subHeading;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public String getLegalText() {
		return legalText;
	}



	public void setLegalText(String legalText) {
		this.legalText = legalText;
	}



	public String getWarning() {
		return warning;
	}



	public void setWarning(String warning) {
		this.warning = warning;
	}



	public Finance() {
		// TODO Auto-generated constructor stub
	}

}
