package br.com.josemarsilva.java_simplecalc_spring_boot;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalcService {

	public String retrieveSimpleCalc() {
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
					"<title>Java Simple Calc Spring Boot</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" +
				"<h1>Java Simple Calc Spring Boot</h1>" +
				"Calcula o resultado de expressões" +
				"<br><br>" +
				"<form action=\"/simpleCalcEvalExpression\" method=\"post\">\r\n" + 
					"<div>\r\n" + 
						"<label for=\"expression\">Expression:</label>\r\n" + 
						"<textarea id=\"expression\"></textarea>\r\n" + 
					"</div>" +
					"<br>" +
					"<input type=\"submit\" value=\"Submit\">\r\n" + 
					"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}

}
