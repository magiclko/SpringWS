/**
 * 
 */
package com.magiclko.calculator.service;

/**
 * @author magiclko
 *
 */
public interface ICalculatorService {
	
	/**
	 * Sum two numbers
	 * @param op1
	 * @param op2
	 * @return sum
	 */
	public float add(float op1, float op2);
	
	/**
	 * Subtract two numbers
	 * @param op1
	 * @param op2
	 * @return difference
	 */
	public float subtract(float op1, float op2);
	
	/**
	 * Multiplication of two numbers
	 * @param op1
	 * @param op2
	 * @return multiplication
	 */
	public float multiply(float op1, float op2);
	
	/**
	 * Division of two numbers
	 * @param op1
	 * @param op2
	 * @return division
	 */
	public float divide(float op1, float op2);

}
