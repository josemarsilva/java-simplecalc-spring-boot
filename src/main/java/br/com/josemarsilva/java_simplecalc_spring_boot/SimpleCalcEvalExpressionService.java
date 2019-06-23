package br.com.josemarsilva.java_simplecalc_spring_boot;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalcEvalExpressionService {

	public String retrieveSimpleCalc() {
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
					"<title>Java Simple Calc Spring Boot</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" +
				"<h1>Java Simple Calc Spring Boot</h1>" +
				"<ul>\r\n" + 
				"<li>Expressão: <code>" + "1 + 1" + "</code></li>\r\n" + 
				"<li>Resultado: <code>" + "2" + "</code></li>\r\n" + 
				"</ul>" +
				"<br>" +
				"<a href=/simpleCalc>voltar</a>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
	
}
