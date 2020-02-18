package com.nissan.mock_finance_api.mock_samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

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

	private List<String> inputCriteria;
	private List<String> outputCriteria;

	private String name;
	private List<String> values;

	
	public SampleData() {
		super();
		url = "fshsdjfhsjf";
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
		purchaseTotal= 50000.0;
		interestRate= 9.0;
		currency= "GBP";
		deposit= 5000.0;
		containsOfferRate= true;
	  offerCode= "N0001";
	  offerDescription= "3% March Sale";
		loanPeriodMonths= 60;
		balloon= 45000.0;
		financeProducts="";
	  insuranceCost=8989.80;
	  registrationCost=898.00;
	  nissanDeposit=787.99;
	frequency= "weekly";
				intervalPayment= 201.0;
				totalInterestPaid= 12071.0;
				totalPaidOverLoan= 62071.0;
				balloonRepayment= 5000.0;
				totalFees= 37.0;
	      totalCreditAmount= 2525.88;
	      optionalFinalPayment=7878.88;
	feeType= "ACCT";
						desc= "Monthly Account Keeping Fee";
						fee= 6.0;
	message= "Information Returned Successfully";
			returnCode= "S";
			inputCriteria = new ArrayList<String>(Arrays.asList("deposit","loanTerm"));
			outputCriteria = new ArrayList<String>(Arrays.asList("interestRate","totalInterest","monthlyInstallment"));
			name = "extendedWarrenty";
			values = new ArrayList<String>(Arrays.asList("Please select","1 pago de $ 9,333"));



	}

	

}
