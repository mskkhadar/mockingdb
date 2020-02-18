package com.nissan.mock_finance_api.mock_samples;

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

/**
 * @description
 * <interface for the getMethods of all DTOs>
 * 
 * @author ndh00592
 * @date 14-Feb-2020
 *
 * 
 * @history
 * 
 * 
 *
 */

public interface DtoInterface {
	
	CalculatorLink getCalculatorLink();
	OptionsResponse getOptionsResponse();
	ConfigParamResponseEligibilityCriteria getConfigParamResponseEligibilityCriteria();
	ConfigParamResponseFinanceProducts getConfigParamResponseFinanceProducts();
	ConfigParamResponseFinanceType getConfigParamResponseFinanceType();
	ConfigParamResponseInputCriteria getConfigParamResponseInputCriteria();
	Elements getElements();
	ElementsInner getElementsInner();
	Finance getFinance();
	FinanceCalc getFinanceCalc();
	FinanceCalcFees getCalcFees();
	FinanceCalcRepayments getFinanceCalcRepayments();
	FinanceCalcRequest getFinanceCalcRequest();
	FinanceCalcRequestFinanceInfo getFinanceCalcRequestFinanceInfo();
	FinanceCalcRequestLocationInfo getFinanceCalcRequestLocationInfo();
	FinanceCalcRequestVehicleInfo getFinanceCalcRequestVehicleInfo();
	FinanceCalcStatus getFinanceCalcStatus();
	InstallmentRequest getInstallmentRequest();
	InstallmentRequestFinanceInfo getInstallmentRequestFinanceInfo();
	InstallmentRequestVehiclesInfo getInstallmentRequestVehiclesInfo();
	InstallmentResponse getInstallmentResponse();
	InstallmentResponseFinanceInfo getInstallmentResponseFinanceInfo();
	InstallmentResponseVehiclesInfo getInstallmentResponseVehiclesInfo();
	Taxes getTaxes();
	TaxesCategories getTaxesCategories();
	TaxesSubCategories getTaxesSubCategories();
	Total getTotal();
	
	
}
