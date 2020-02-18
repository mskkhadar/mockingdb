dfsdjhfbsdjhfbvsdjhfv
dfsdjhfbsdjhfbvsdjhfv
arun ka change hai ye1
package com.nissan.mock_finance_api.mock_samples;



import java.util.ArrayList;
import java.util.List;
___________________________________
import lombok.Data;
arun ka change hai ye2;

@Data
public class SampleData {
	private String url;

	private String label;

	private int price;

	private int monthlyPayment;

	private int months;

	private String currency;

	public enum FinanceTypeEnum {
		finance, lease;
	}

	public FinanceTypeEnum financeType;

	private String heading;

	private String subHeading;

	private String text;

	private String legalText;

	private String warning;
	
	private String code;
	private int value;
	private String title;
	
	private String name;
	private String minValue;
	private String maxValue;
	private String defaultValue;
	private List<Object> possibleValues = new ArrayList<>();
	private String unit;
	private Boolean mandatory;
	private Boolean recalculationRequired;
	private String description;
	private String disclaimer;
	private Boolean _default;
	private double purchaseTotal;
	private double interestRate;
	private Boolean containsOfferRate;
	private String offerCode;
	private String offerDescription;
	private double deposit;
	private int loanPeriodMonths;
	private double balloon;
	private double nissanDeposit;
	private double registrationCost;
	private double insuranceCost;
	private String productCode;
	private String frequency;
	private double intervalPayment;
	private double totalInterestPaid;
	private double totalPaidOverLoan;
	private double balloonRepayment;
	private double totalFees;
	private double totalCreditAmount;
	private double optionalFinalPayment;
	private String feeType;
	private String desc;
	private double fee;
	private String message ;
	private String returnCode ;
	private String code;
	private int value;
	private String title;
	private String financeProducts;
	





//	private String gradeId;
//	private String configurationURL;
//	private String priceCode;
//	private String VersionId;
//	private String gradeKey;
//	private String versionKey;
//	private String eimCode;
//	private String color;
//	private int mileage;
//	private String productCode;
//	private String purchasePrice;
//	private String basePrice;
//	private String colorPrice;
//	private String deposit;
//	private String eligibility;
//	private String modelCode;
//	private String modelCode;
//	private String modelCode;
//	private String modelCode;
//	private String modelCode;
//	private String modelCode;
//	pri

	

	public SampleData() {
		super();
		url = "http://www.nissanusa.com/buildyournissan/paymentEstimator/calculate?vehicle=juke&grade=SE&priceType=finance&price=24550&totalPrice=26000&zipCode=90210";
		label = "Monthly Price";
		price = 23730;
		monthlyPayment = 900;
		months = 36;
		currency = "GBP";
		financeType = FinanceTypeEnum.finance;
		heading = "Renault special credit program";
		subHeading = "This offer requires an advance Payment";
		text = "Car price: £23,730<br/> Deposit: £5,000 <br/> Loan term: 36 months <br/> Credit rate: 4.5%";
		legalText = "Offer valid until 31st March 2016 at participating dealers only and subject to vehicle availability. Finance provided by RCI Financial Services Limited, PO Box 149, Watford WD17 1FJ. Subject to status. Guarantees and indemnities may be required. You must be at least 18 and a UK resident (excluding the Isle of Man and Channel Islands). Terms and conditions apply, please visit <a href=\\\"http://www.nissan-offers.co.uk/termsandconditions\\\">www.nissan-offers.co.uk/termsandconditions</a> or your local dealer for full details. 25% MINIMUM DEPOSIT REQUIRED Offer based on 10,000 miles pa, excess mileage 8p per mile. Offers not available in conjunction with any schemes or other offers. Fixed price servicing available for both finance and now cash customers. Vehicle price includes first registration fee and 12 months’ road fund licence. Images shown are for guidance purposes. In some instances photos are of non UK specification vehicles and do not represent specific grade model or offer.";
		warning = "A credit commitment must be repaid . Please check your repayment capacity before you commit.";
		code = "C01";
		value = 22500;
		title = "Expenses details";
		name = "deposit";
		minValue = "1000";
		maxValue = "45000";
		defaultValue = "4000";
		possibleValues.add("1");
		unit = "years";
		mandatory = true;
		recalculationRequired = true;
		description = "100% on road value description";
		disclaimer = "100% on road value disclaimer";
		_default = true;
		
		
		
		
	}

	
}
