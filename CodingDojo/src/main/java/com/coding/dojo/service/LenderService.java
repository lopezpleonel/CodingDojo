package com.coding.dojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coding.dojo.dao.LenderRepository;
import com.coding.dojo.model.Lender;

@Service
public class LenderService {
	
	@Autowired
	private LenderRepository lenderRepository;
	
	public List<Lender> getAllLenders() {
		return (List<Lender>) this.lenderRepository.findAll();
	}
	
	public Optional<Lender> getOneLender(Integer id) {
		return this.lenderRepository.findById(id);
	}	
	
	public Lender addLender(Lender lender) {
		return this.lenderRepository.save(lender);
	}
	
}
