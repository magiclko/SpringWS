/**
 * 
 */
package com.magiclko.calculator.client;

import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author magiclko
 *
 */
public class TestClient {
	
	private static final String MESSAGE =
			"<subtractRequest xmlns=\"http://loadingjava.blogspot.in/\">" +
			"<operand1>0</operand1>" +
			"<operand2>098</operand2>" +
			"</subtractRequest>";
	
	private static WebServiceTemplate webServiceTemplate;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		consumeService();
	}
	
	public static void consumeService() {
		System.out.println(TestClient.webServiceTemplate.getDefaultUri());
		StreamSource source = new StreamSource(new StringReader(MESSAGE));
		StreamResult result = new StreamResult(System.out);
		webServiceTemplate.sendSourceAndReceiveToResult(source, result);
	}

	public WebServiceTemplate getWebServiceTemplate() {
		return webServiceTemplate;
	}

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}
	

}
