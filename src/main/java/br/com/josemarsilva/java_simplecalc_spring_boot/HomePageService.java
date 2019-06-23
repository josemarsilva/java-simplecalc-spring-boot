package br.com.josemarsilva.java_simplecalc_spring_boot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

// Spring to manage this bean and create instance
@Component
public class HomePageService {
	
	public String retrieveWelcomeMessage() {
		//Complex Method
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Java Simple Calc Spring Boot</title>\r\n" + 
				"</head>\r\n" + 
				"<body>" +
				"<h1>Home Page - Java Simple Calc Spring Boot</h1>" +
				"Welcome to Java Simple Calc Spring Boot ! It's already " + strDate + "</body></html>" +
				"<br>" +
				"<ul>\r\n" + 
				"<li><a href=/simpleCalc>Expression Calculator</a></li>\r\n" + 
				"</ul>" +
				"</body>\r\n" + 
				"</html>";
	}

}
