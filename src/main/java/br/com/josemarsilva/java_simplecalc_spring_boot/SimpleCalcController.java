package br.com.josemarsilva.java_simplecalc_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalcController {

	//Auto wiring
	@Autowired
	private SimpleCalcService simpleCalcService;
	
	@RequestMapping("/simpleCalc")
	public String welcome() {
		return simpleCalcService.retrieveSimpleCalc();
	}

}
