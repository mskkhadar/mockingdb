package com.nissan.mock_finance_api.mock_samples;

import java.util.ArrayList;
import java.util.List;

import com.nissan.mock_finance_api.dto.CalculatorLink;
import com.nissan.mock_finance_api.dto.OptionsResponse;
import com.nissan.mock_finance_api.dto.ConfigParamResponseEligibilityCriteria;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceProducts;
import com.nissan.mock_finance_api.dto.ConfigParamResponseFinanceType;
import com.nissan.mock_finance_api.dto.ConfigParamResponseInputCriteria;
import com.nissan.mock_finance_api.dto.Elements;
import com.nissan.mock_finance_api.dto.ElementsInner;
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
import com.nissan.mock_finance_api.dto.Taxes;
import com.nissan.mock_finance_api.dto.TaxesCategories;
import com.nissan.mock_finance_api.dto.TaxesSubCategories;
import com.nissan.mock_finance_api.dto.Total;

public class DtoMocker implements DtoInterface {

	SampleData sample = new SampleData();
	
	public CalculatorLink getCalculatorLink() {
		// TODO Auto-generated method stub
		
		CalculatorLink calculatorLink = new CalculatorLink();
		calculatorLink.setUrl(sample.getUrl());

		return calculatorLink;
	}

	public OptionsResponse getOptionsResponse() {
		// TODO Auto-generated method stub
		List<ConfigParamResponseFinanceType> listConfigParamResponseFinanceTypes = new ArrayList<>();
		listConfigParamResponseFinanceTypes.add(getConfigParamResponseFinanceType());
		OptionsResponse optionsResponse = new OptionsResponse(listConfigParamResponseFinanceTypes);
		return optionsResponse;
	}

	public ConfigParamResponseEligibilityCriteria getConfigParamResponseEligibilityCriteria() {
		// TODO Auto-generated method stub
		List<ConfigParamResponseFinanceProducts> listConfigParamResponseFinanceProducts = new ArrayList<>();
		listConfigParamResponseFinanceProducts.add(getConfigParamResponseFinanceProducts());
		ConfigParamResponseEligibilityCriteria configParamResponseEligibilityCriteria = new ConfigParamResponseEligibilityCriteria(sample.getName(), sample.get_default(), listConfigParamResponseFinanceProducts);
		return configParamResponseEligibilityCriteria;
	}

	public ConfigParamResponseFinanceProducts getConfigParamResponseFinanceProducts() {
		// TODO Auto-generated method stub
		List<ConfigParamResponseInputCriteria> listConfigParamResponseInputCriterias = new ArrayList<>();
		listConfigParamResponseInputCriterias.add(getConfigParamResponseInputCriteria());
		ConfigParamResponseFinanceProducts configParamResponseFinanceProducts = new ConfigParamResponseFinanceProducts(sample.getName(), sample.getCode(), sample.getDescription(), sample.getDisclaimer(), sample.get_default(), listConfigParamResponseInputCriterias);
		return configParamResponseFinanceProducts;
	}

	public ConfigParamResponseFinanceType getConfigParamResponseFinanceType() {
		// TODO Auto-generated method stub
		List<ConfigParamResponseEligibilityCriteria> listConfigParamResponseEligibilityCriterias = new ArrayList<>();
		listConfigParamResponseEligibilityCriterias.add(getConfigParamResponseEligibilityCriteria());
		ConfigParamResponseFinanceType configParamResponseFinanceType = new ConfigParamResponseFinanceType(sample.getName(), sample.get_default(), listConfigParamResponseEligibilityCriterias);
		return configParamResponseFinanceType;
	}

	public ConfigParamResponseInputCriteria getConfigParamResponseInputCriteria() {
		// TODO Auto-generated method stub
		ConfigParamResponseInputCriteria configParamResponseInputCriteria = new ConfigParamResponseInputCriteria(sample.getName(), sample.getMinValue(), sample.getMaxValue(), sample.getDefaultValue(), sample.getPossibleValues(), sample.getUnit(), sample.getMandatory(), sample.getRecalculationRequired());
		return configParamResponseInputCriteria;
	}

	public Elements getElements() {
		// TODO Auto-generated method stub
		Elements elements = new Elements();
		elements.add(getElementsInner());
//		Elements elements = new Elements(listElementsInner);
		return elements;
	}

	public ElementsInner getElementsInner() {
		// TODO Auto-generated method stub
		ElementsInner elementsInner =  new ElementsInner(sample.getCode(), sample.getLabel(), sample.getValue());
		return elementsInner;
	}

	public Finance getFinance() {
		
		Finance finance =  new Finance(sample.getLabel(), sample.getPrice(), sample.getMonthlyPayment(), sample.getMonths(),
				sample.getCurrency(), sample.getFinanceType(), sample.getHeading(), sample.getSubHeading(),
				sample.getText(), sample.getLegalText(), sample.getWarning());

		return finance;
	}

	public FinanceCalc getFinanceCalc() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcFees getCalcFees() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceCalcRepayments getFinanceCalcRepayments() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	public InstallmentRequest getInstallmentRequest() {
		// TODO Auto-generated method stub
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
		List<TaxesCategories> listCategories = new ArrayList<>();
		listCategories.add(getTaxesCategories());
		Taxes taxes = new Taxes(sample.getCurrency(), listCategories, getTotal() );
 		return taxes;
	}

	public TaxesCategories getTaxesCategories() {
		// TODO Auto-generated method stub
		List<TaxesSubCategories> listSubCategories = new ArrayList<>();
		listSubCategories.add(getTaxesSubCategories());
		TaxesCategories taxesCategories = new TaxesCategories(sample.getCode(), sample.getTitle(), listSubCategories, getElements());
		return taxesCategories;
	}

	public TaxesSubCategories getTaxesSubCategories() {
		// TODO Auto-generated method stub
		TaxesSubCategories taxesSubCategories = new TaxesSubCategories(sample.getCode(), getTotal(), getElements());
		return taxesSubCategories;
	}

	public Total getTotal() {
		// TODO Auto-generated method stub
		Total total = new Total(sample.getCode(), sample.getLabel(), sample.getValue());
		return total;
	}

//	CalculatorLink getCalculatorLink(){
//		SampleData obj = new Samle;
//		return ccaclobj;
//	}

}
