package br.com.josemarsilva.java_simplecalc_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalcEvalExpressionController {
	
	//Auto wiring
	@Autowired
	private SimpleCalcEvalExpressionService simpleCalcEvalExpressionService;
	
	@RequestMapping("/simpleCalcEvalExpression")
	public String welcome() {
		return simpleCalcEvalExpressionService.retrieveSimpleCalc();
	}

}
