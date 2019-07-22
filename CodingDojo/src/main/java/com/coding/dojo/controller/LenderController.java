package com.coding.dojo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.dojo.model.Lender;
import com.coding.dojo.service.LenderService;

@RestController
@RequestMapping("/lender")
public class LenderController {

	@Autowired	
	private LenderService l;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Lender> getAllLenders() {
		return l.getAllLenders();
	}
	
	@RequestMapping(value = "/getLender/{id}", method = RequestMethod.GET)
	public Optional<Lender> getLender(@PathVariable("id") Integer id) {
		return l.getOneLender(id);	
	}	
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public Lender addNewlender(@RequestParam("lend") Lender lender) {
		return l.addLender(lender);
	}	


}
