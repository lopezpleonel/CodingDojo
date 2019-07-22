package com.coding.dojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.dojo.dao.LendDetailRepository;
import com.coding.dojo.model.LendDetail;

@Service
public class LendDetailService {

	@Autowired
	private LendDetailRepository lendRepository;
	
	public List<LendDetail> getAllLends() {
		return (List<LendDetail>) this.lendRepository.findAll();
	}
	
	public Optional<LendDetail> getOneLend(Integer id) {
		return this.lendRepository.findById(id);
	}	
	
	public LendDetail addLend(LendDetail lend) {
		return this.lendRepository.save(lend);
	}	
	
	
}
