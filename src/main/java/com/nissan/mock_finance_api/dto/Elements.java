package com.nissan.mock_finance_api.dto;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import com.nissan.mock_finance_api.dto.ElementsInner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * Elements
 */
@Validated
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor

public class Elements extends ArrayList<ElementsInner>  {
	private List<ElementsInner> elementsInners = new ArrayList<ElementsInner>();
}