package com.nissan.mock_finance_api.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nissan.mock_finance_api.dto.CalculatorLink;
import com.nissan.mock_finance_api.dto.OptionsResponse;
import com.nissan.mock_finance_api.dto.Finance;
import com.nissan.mock_finance_api.dto.FinanceCalc;
import com.nissan.mock_finance_api.dto.FinanceCalcRequest;
import com.nissan.mock_finance_api.dto.InstallmentRequest;
import com.nissan.mock_finance_api.dto.InstallmentResponse;
import com.nissan.mock_finance_api.dto.Taxes;
import com.nissan.mock_finance_api.mock_samples.DtoMocker;

@org.springframework.stereotype.Service
public class Service {

	private DtoMocker dtoMocker = new DtoMocker();

	public ResponseEntity<Finance> getV2FinanceModelsModelCodeOfferGet(String modelCode) {
		Finance finance = dtoMocker.getFinance();

		return new ResponseEntity<Finance>(finance, HttpStatus.OK);
	}

	public ResponseEntity<CalculatorLink> getV2FinanceModelsModelCodeCalculatorLinkGet() {

		CalculatorLink calculatorLink = dtoMocker.getCalculatorLink();

		return new ResponseEntity<CalculatorLink>(calculatorLink, HttpStatus.OK);
	}

	public ResponseEntity<Finance> getV2FinanceModelsModelCodeGradesGradeIdOfferGet(String modelCode, String gradeId) {
		Finance finance = dtoMocker.getFinance();

		return new ResponseEntity<Finance>(finance, HttpStatus.OK);
	}

	public ResponseEntity<CalculatorLink> getV2FinanceModelsModelCodeGradesGradeIdCalculatorLinkGet(String modelCode,
			String gradeId) {
		CalculatorLink calculatorLink = dtoMocker.getCalculatorLink();

		return new ResponseEntity<CalculatorLink>(calculatorLink, HttpStatus.OK);
	}

	public ResponseEntity<Finance> getV2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdOfferGet(String modelCode,
			String gradeId, String versionId) {
		Finance finance = dtoMocker.getFinance();

		return new ResponseEntity<Finance>(finance, HttpStatus.OK);
	}

	public ResponseEntity<CalculatorLink> getV2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdCalculatorLinkGet(
			String modelCode, String gradeId, String versionId) {
		CalculatorLink calculatorLink = dtoMocker.getCalculatorLink();

		return new ResponseEntity<CalculatorLink>(calculatorLink, HttpStatus.OK);
	}

	public ResponseEntity<Taxes> getV2FinanceModelsModelCodeTaxesGet(String modelCode) {
		Taxes taxes = dtoMocker.getTaxes();

		return new ResponseEntity<Taxes>(taxes, HttpStatus.OK);
	}

	public ResponseEntity<OptionsResponse> getV2FinanceModelsInstallmentsOptionsGet() {
		OptionsResponse configParamResponse = dtoMocker.getOptionsResponse();

		return new ResponseEntity<OptionsResponse>(configParamResponse, HttpStatus.OK);
	}

	public ResponseEntity<Finance> postV2FinanceModelsInstallmentsPost(InstallmentResponse installmentResponse) {
		Finance finance = dtoMocker.getFinance();

		return new ResponseEntity<Finance>(finance, HttpStatus.OK);
	}

	public ResponseEntity<InstallmentResponse> postV2FinanceModelsInstallmentsPost(
			InstallmentRequest installmentRequest) {
		InstallmentResponse installmentResponse = dtoMocker.getInstallmentResponse();

		return new ResponseEntity<InstallmentResponse>(installmentResponse, HttpStatus.OK);
	}

	public ResponseEntity<FinanceCalc> postV2FinanceModelsFinanceCalcPost(
			FinanceCalcRequest financeCalcRequest) {
		FinanceCalc financeCalc = dtoMocker.getFinanceCalc();

		return new ResponseEntity<FinanceCalc>(financeCalc, HttpStatus.OK);
	}

}
