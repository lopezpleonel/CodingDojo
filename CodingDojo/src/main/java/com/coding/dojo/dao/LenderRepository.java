package com.coding.dojo.dao;

import org.springframework.data.repository.CrudRepository;

import com.coding.dojo.model.Lender;

public interface LenderRepository extends CrudRepository<Lender, Integer> {

}
