/**
 * 
 */
package com.magiclko.calculator.service.impl;

import org.springframework.stereotype.Service;

import com.magiclko.calculator.service.ICalculatorService;

/**
 * @author magiclko
 *
 */
@Service
public class CalculatorServiceImpl implements ICalculatorService {

	public float add(float op1, float op2) {
		return op1 + op2;
	}

	public float subtract(float op1, float op2) {
		return op1 - op2;
	}

	public float multiply(float op1, float op2) {
		return op1 * op2;
	}

	public float divide(float op1, float op2) {
		return op1 / op2;
	}

}
