package com.coding.dojo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coding.dojo.model.LendDetail;
import com.coding.dojo.service.LendDetailService;

@RestController
@RequestMapping("/lendDetail")
public class LendDetailController {

	@Autowired
	private LendDetailService ld;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<LendDetail> getAllLends() {
		return ld.getAllLends();
	}
	
	@RequestMapping(value = "/getLend/{id}", method = RequestMethod.GET)
	public Optional<LendDetail> getLend(@PathVariable("id") Integer id) {
		return ld.getOneLend(id);	
	}	
	
    public LendDetail addNewLend (@RequestBody LendDetail lend) {
        return ld.addLend(lend);
    }  
}
