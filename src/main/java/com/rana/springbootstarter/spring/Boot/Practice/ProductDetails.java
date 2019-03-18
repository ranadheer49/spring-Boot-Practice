package com.rana.springbootstarter.spring.Boot.Practice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetails {
	@Autowired
	private DetailsService detailsservice;
	@Autowired
	private Details details;
	
	@GetMapping(path= "/getDetails/{i}")
	public String getDetails(@PathVariable("i") Integer i) {
		if (i==1) {
			return "HelloWorld 1";
		}
		else {
			return "HelloWorld 2 edited one now";	
		}
		
	}
	
	@GetMapping(path = "/getDetailsObject")
	public Details getDetialsObject() {
		
		return detailsservice.sendDetails();
		
	}

	
	@GetMapping(path = "/getDetailsObjects")
	public Details getDetialsObject1() {
		
		return detailsservice.sendDetails();
		
	}
}
