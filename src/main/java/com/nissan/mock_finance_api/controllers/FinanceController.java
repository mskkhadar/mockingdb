package com.nissan.mock_finance_api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.mock_finance_api.dto.CalculatorLink;
import com.nissan.mock_finance_api.dto.OptionsResponse;
import com.nissan.mock_finance_api.dto.Finance;
import com.nissan.mock_finance_api.dto.FinanceCalc;
import com.nissan.mock_finance_api.dto.FinanceCalcRequest;
import com.nissan.mock_finance_api.dto.InstallmentRequest;
import com.nissan.mock_finance_api.dto.InstallmentResponse;
import com.nissan.mock_finance_api.dto.Taxes;
import com.nissan.mock_finance_api.services.Service;

@RestController
public class FinanceController {

	@Autowired
	private Service service;

	@GetMapping("/{modelCode}/offer")
	public ResponseEntity<Finance> v2FinanceModelsModelCodeOfferGet(@PathVariable String modelCode) {
		return service.getV2FinanceModelsModelCodeOfferGet(modelCode);
	}

	@GetMapping("/calculatorLink")
	public ResponseEntity<CalculatorLink> v2FinanceModelsModelCodeCalculatorLinkGet() {
		return service.getV2FinanceModelsModelCodeCalculatorLinkGet();
	}

	@GetMapping("/{modelCode}/grades/{gradeId}/offer")
	public ResponseEntity<Finance> v2FinanceModelsModelCodeGradesGradeIdOfferGet(@PathVariable String modelCode, @PathVariable String gradeId) {
		return service.getV2FinanceModelsModelCodeGradesGradeIdOfferGet(modelCode,gradeId);
	}

	@GetMapping("/{modelCode}/grades/{gradeId}/offer/calculatorLink")
	public ResponseEntity<CalculatorLink> v2FinanceModelsModelCodeGradesGradeIdCalculatorLinkGet(@PathVariable String modelCode, @PathVariable String gradeId) {
		return service.getV2FinanceModelsModelCodeGradesGradeIdCalculatorLinkGet(modelCode,gradeId);
	}

	@GetMapping("/{modelCode}/grades/{gradeId}/offer/versions/{versionId}/offer")
	public ResponseEntity<Finance> v2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdOfferGet(@PathVariable String modelCode, @PathVariable String gradeId, @PathVariable String versionId) {
		return service.getV2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdOfferGet(modelCode,gradeId,versionId);
	}

	@GetMapping("/{modelCode}/grades/{gradeId}/versions/{versionId}/calculatorLink")
	public ResponseEntity<CalculatorLink> v2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdCalculatorLinkGet(@PathVariable String modelCode, @PathVariable String gradeId, @PathVariable String versionId) {
		return service.getV2FinanceModelsModelCodeGradesGradeIdVersionsVersionIdCalculatorLinkGet(modelCode,gradeId,versionId);
	}
	
	@GetMapping("{modelCode}/taxes")
	public ResponseEntity<Taxes> v2FinanceModelsModelCodeTaxesGet(@PathVariable String modelCode) {
		return service.getV2FinanceModelsModelCodeTaxesGet(modelCode);
	}
	
	@GetMapping("/installments/options")
	public ResponseEntity<OptionsResponse> v2FinanceModelsInstallmentsOptionsGet(@RequestParam String modelCode, @RequestParam String gradeKey, @RequestParam String versionKey, @RequestParam String eimCode) {

		return service.getV2FinanceModelsInstallmentsOptionsGet();
	}
	
	@PostMapping("/installments")
	public ResponseEntity<InstallmentResponse> v2FinanceModelsInstallmentsPost(@RequestBody InstallmentRequest installmentRequest) {
		return service.postV2FinanceModelsInstallmentsPost(installmentRequest);
	}
	
	@PostMapping("/financeCalc")
	public ResponseEntity<FinanceCalc> v2FinanceModelsFinanceCalcPost(@RequestBody FinanceCalcRequest installmentRequest) {
		return service.postV2FinanceModelsFinanceCalcPost(installmentRequest);
	}


}
