package net.rg.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	//****************************** HOME **************************************
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}

	//****************************** TEST **************************************
	
	// Commentato perchè sostituito da @PathVariable -- Source:https://www.youtube.com/watch?v=IXg52Lg58m4&list=PLAXbOMavY3k1VJGqqhfqAn0tUSC14Qsvq&index=8
//	@RequestMapping(value = { "/test" })
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
//		if(greeting ==null) {
//			
//			greeting ="Default Welcome";
//			
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting+" to Spring Web MVC");
//		return mv;

	
	@RequestMapping(value = { "/test/{greeting}" })
	public ModelAndView test(@PathVariable(value="greeting", required=false)String greeting) {
		if(greeting ==null) {
			
			greeting ="Default Welcome";
			
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting+" to Spring Web MVC");
		return mv;		
	}
	
	//****************************** HELLO WORD **************************************
	@RequestMapping(value = { "/hello-world"})
	public ModelAndView helloWorld() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
	//****************************** TABlE-TEST **************************************
	@RequestMapping(value = { "/table-test" })
	public ModelAndView tableTest() {
		ModelAndView mv = new ModelAndView("table-test");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
	//****************************** FORM-TEST **************************************
		@RequestMapping(value = { "/form-test" })
		public ModelAndView formTest() {
			ModelAndView mv = new ModelAndView("form-test");		
			return mv;
		}
	
	
}
