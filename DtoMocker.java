package com.nissan.mock_finance_api.mock_samples;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nissan.mock_finance_api.dto.CalculatorLink;
import com.nissan.mock_finance_api.dto.ConfigParamResponse;
import com.nissan.mock_finance_api.dto.ConfigParamResponseEligibilityCriteria;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceProducts;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceType;
import com.nissan.mock_finance_api.dto.ConfigParamResponseInputItems;
import com.nissan.mock_finance_api.dto.Elements;
import com.nissan.mock_finance_api.dto.ElementsInner;
import com.nissan.mock_finance_api.dto.Field;
import com.nissan.mock_finance_api.dto.Finance;
import com.nissan.mock_finance_api.dto.FinanceCalc;
import com.nissan.mock_finance_api.dto.FinanceCalcFees;
import com.nissan.mock_finance_api.dto.FinanceCalcRepayments;
import com.nissan.mock_finance_api.dto.FinanceCalcRequest;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestFinanceInfo;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestLocationInfo;
import com.nissan.mock_finance_api.dto.FinanceCalcRequestVehicleInfo;
import com.nissan.mock_finance_api.dto.FinanceCalcStatus;
import com.nissan.mock_finance_api.dto.InstallmentRequest;
import com.nissan.mock_finance_api.dto.InstallmentRequestFinanceInfo;
import com.nissan.mock_finance_api.dto.InstallmentRequestVehiclesInfo;
import com.nissan.mock_finance_api.dto.InstallmentResponse;
import com.nissan.mock_finance_api.dto.InstallmentResponseFinanceInfo;
import com.nissan.mock_finance_api.dto.InstallmentResponseVehiclesInfo;
import com.nissan.mock_finance_api.dto.RecalculatedItem;
import com.nissan.mock_finance_api.dto.Taxes;
import com.nissan.mock_finance_api.dto.TaxesCategories;
import com.nissan.mock_finance_api.dto.TaxesSubCategories;
import com.nissan.mock_finance_api.dto.Total;

@Component
public class DtoMocker implements DtoInterface {

	SampleData sampleData = new SampleData();

	public CalculatorLink getCalculatorLink() {
		// TODO Auto-generated method stub
		SampleData sampleData = new SampleData();
		CalculatorLink calculatorLink = new CalculatorLink();
		calculatorLink.setUrl(sampleData.getUrl());

		return calculatorLink;
	}

	public ConfigParamResponse getConfigParamResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfigParamResponseEligibilityCriteria getConfigParamResponseEligibilityCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfigParamResponseFinanceProducts getConfigParamResponseFinanceProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfigParamResponseFinanceType getConfigParamResponseFinanceType() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfigParamResponseInputItems getConfigParamResponseInputItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public Elements getElements() {
		// TODO Auto-generated method stub
		return null;
	}

	public ElementsInner getElementsInner() {
		// TODO Auto-generated method stub
		return null;
	}

	public Finance getFinance() {

		SampleData sample = new SampleData();
		Finance finance = new Finance(sample.getLabel(), sample.getPrice(), sample.getMonthlyPayment(),
				sample.getMonths(), sample.getCurrency(), sample.getFinanceType(), sample.getHeading(),
				sample.getSubHeading(), sample.getText(), sample.getLegalText(), sample.getWarning());

		return finance;
	}

	public FinanceCalc getFinanceCalc() {
		
		List<FinanceCalcRepayments> repayments = new ArrayList<FinanceCalcRepayments>();
		repayments.add(getFinanceCalcRepayments());
		
		FinanceCalc financeCalc = new FinanceCalc(sampleData.getPurchaseTotal(), sampleData.getCurrency(), sampleData.getInterestRate(), sampleData.getContainsOfferRate(), sampleData.getOfferCode(), sampleData.getOfferDescription(), sampleData.getDeposit(), sampleData.getLoanPeriodMonths(), sampleData.getBalloon(), sampleData.getFinanceType(), sampleData.getNissanDeposit(), sampleData.getRegistrationCost(), sampleData.getInsuranceCost(), sampleData.getProductCode(), repayments, getFinanceCalcStatus(), sampleData.getFinanceProducts());

		return financeCalc;
	}

	public FinanceCalcFees getCalcFees() {
		FinanceCalcFees calcFees = new FinanceCalcFees(sampleData.getFeeType(), sampleData.getDesc(), sampleData.getFee());
		return calcFees;
	}

	public FinanceCalcRepayments getFinanceCalcRepayments() {
		List<FinanceCalcFees> fees = new ArrayList<FinanceCalcFees>();
		fees.add(getCalcFees());
		
		List<RecalculatedItem> recalculatedItems = new ArrayList<RecalculatedItem>();
		recalculatedItems.add(getRecalculatedItem());
		
		FinanceCalcRepayments financeCalcRepayments = new FinanceCalcRepayments(sampleData.getFrequency(),
				sampleData.getIntervalPayment(), sampleData.getTotalInterestPaid(), sampleData.getTotalPaidOverLoan(),
				sampleData.getBalloonRepayment(), sampleData.getTotalFees(), sampleData.getTotalCreditAmount(),
				sampleData.getOptionalFinalPayment(),recalculatedItems,fees );
		return financeCalcRepayments;
	}

	private RecalculatedItem getRecalculatedItem() {
		RecalculatedItem recalculatedItem = new RecalculatedItem(sampleData.getName(), sampleData.getValues());
		return recalculatedItem;
	}

	public FinanceCalcRequest getFinanceCalcRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcRequestFinanceInfo getFinanceCalcRequestFinanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcRequestLocationInfo getFinanceCalcRequestLocationInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcRequestVehicleInfo getFinanceCalcRequestVehicleInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcStatus getFinanceCalcStatus() {
		FinanceCalcStatus financeCalcStatus = new FinanceCalcStatus(sampleData.getMessage(), sampleData.getReturnCode(),
				sampleData.getCode());
		return financeCalcStatus;
	}

	public InstallmentRequest getInstallmentRequest() {

		return null;
	}

	public InstallmentRequestFinanceInfo getInstallmentRequestFinanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public InstallmentRequestVehiclesInfo getInstallmentRequestVehiclesInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public InstallmentResponse getInstallmentResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	public InstallmentResponseFinanceInfo getInstallmentResponseFinanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public InstallmentResponseVehiclesInfo getInstallmentResponseVehiclesInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Taxes getTaxes() {
		// TODO Auto-generated method stub
		return null;
	}

	public TaxesCategories getTaxesCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public TaxesSubCategories getTaxesSubCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public Total getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Field getField() {
		Field field =  new Field(sampleData.getInputCriteria(), sampleData.getOutputCriteria());
		return field;
	}

//	CalculatorLink getCalculatorLink(){
//		SampleData obj = new Samle;
//		return ccaclobj;
//	}

}
