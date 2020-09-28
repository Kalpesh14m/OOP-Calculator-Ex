package com.blz.learning;

import java.util.Scanner;

import com.blz.learning.model.InputPara;
import com.blz.learning.service.CalculatorService;
import com.blz.learning.service.provider.CalculatorServiceProvider;

public class Calculator {

	// This is Scanner Class

	/*
	 * @author: Kalpesh
	 */
	private static final Scanner SC = new Scanner(System.in);

	public final strictfp static void main(String[] args) {
		InputPara inputs = new InputPara();

		System.out.println("Enter First Name: ");
		inputs.setFirstName(SC.next());
		System.out.println("Enter Last Name: ");
		inputs.setLastName(SC.next());

		CalculatorService service = new CalculatorServiceProvider();

		System.out.println("Ans: " + service.add(inputs));
	}

}
