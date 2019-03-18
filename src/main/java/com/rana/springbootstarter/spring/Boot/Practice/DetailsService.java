package com.rana.springbootstarter.spring.Boot.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsService {
	@Autowired
	private Details details;
	
	
	
	public DetailsService(Details details) {
		super();
		this.details = details;
	}



	public DetailsService() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Details sendDetails() {
		details.setId(1);
		details.setName("Test Name");
		details.setMarks(50.00);
		
		return details;
	}
	
	
}
