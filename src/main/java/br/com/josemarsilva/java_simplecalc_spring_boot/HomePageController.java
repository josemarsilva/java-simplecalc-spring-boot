package br.com.josemarsilva.java_simplecalc_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

	//Auto wiring
	@Autowired
	private HomePageService service;
	
	@RequestMapping("/")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

}
