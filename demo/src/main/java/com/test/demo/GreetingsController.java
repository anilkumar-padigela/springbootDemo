/**
 * 
 */
package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Padigela Anil kumar
 *
 */
@RestController
@RequestMapping(value="/greetings")
public class GreetingsController {

	/**
	 * 
	 */
	public GreetingsController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value="/message")
	public String getMessage()
	{
		return "This is project is dedicated to Rajesh Srinivasan";
	}
	
	

}
