package com.blz.learning.service.provider;

import com.blz.learning.model.InputPara;
import com.blz.learning.service.CalculatorService;

public class CalculatorServiceProvider implements CalculatorService {

	@Override
	public String add(InputPara request) {
		return "Welcome, " + request.getFirstName() + "  " + request.getLastName();
	}

}
