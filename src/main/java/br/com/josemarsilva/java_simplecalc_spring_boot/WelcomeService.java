package br.com.josemarsilva.java_simplecalc_spring_boot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

// Spring to manage this bean and create instance
@Component
public class WelcomeService {
	
	public String retrieveWelcomeMessage() {
		//Complex Method
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
		return "Good Morning ! It's already " + strDate ;
	}

}
