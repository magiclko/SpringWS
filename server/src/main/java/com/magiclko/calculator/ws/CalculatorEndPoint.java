/**
 * 
 */
package com.magiclko.calculator.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.magiclko.calculator.model.AddRequest;
import com.magiclko.calculator.model.AddResponse;
import com.magiclko.calculator.model.DivideRequest;
import com.magiclko.calculator.model.DivideResponse;
import com.magiclko.calculator.model.MultiplyRequest;
import com.magiclko.calculator.model.MultiplyResponse;
import com.magiclko.calculator.model.SubtractRequest;
import com.magiclko.calculator.model.SubtractResponse;
import com.magiclko.calculator.service.ICalculatorService;

/**
 * @author magiclko
 *
 */
@Endpoint
public class CalculatorEndPoint {
	
	
	private ICalculatorService CService;
	
	@PayloadRoot(localPart = "addRequest", namespace = "http://loadingjava.blogspot.in/")
	@ResponsePayload
	public AddResponse addTwoNumbers(@RequestPayload AddRequest addRequest) {
		AddResponse addResponse = new AddResponse();
		addResponse.setResult(addRequest.getOperand1().add(addRequest.getOperand2()));
		return addResponse;
	}
	
	@PayloadRoot(localPart = "subtractRequest", namespace = "http://loadingjava.blogspot.in/")
	@ResponsePayload
	public SubtractResponse subtractTwoNumbers(@RequestPayload SubtractRequest subRequest) {
		SubtractResponse subResponse = new SubtractResponse();
		subResponse.setResult(subRequest.getOperand1().subtract(subRequest.getOperand2()));
		return subResponse;
	}
	
	@PayloadRoot(localPart = "multiplyRequest", namespace = "http://loadingjava.blogspot.in/")
	@ResponsePayload
	public MultiplyResponse mulltiplyTwoNumbers(@RequestPayload MultiplyRequest mulRequest) {
		MultiplyResponse mulResponse = new MultiplyResponse();
		mulResponse.setResult(mulRequest.getOperand1().multiply(mulRequest.getOperand2()));
		return mulResponse;
	}
	
	@PayloadRoot(localPart = "divideRequest", namespace = "http://loadingjava.blogspot.in/")
	@ResponsePayload
	public DivideResponse divideTwoNumbers(@RequestPayload DivideRequest dvdRequest) {
		DivideResponse dvdResponse = new DivideResponse();
		dvdResponse.setResult(dvdRequest.getOperand1().divide(dvdRequest.getOperand2()));
		return dvdResponse;
	}

	public ICalculatorService getCService() {
		return CService;
	}
	
	@Autowired
	public void setCService(ICalculatorService cService) {
		CService = cService;
	}

}
