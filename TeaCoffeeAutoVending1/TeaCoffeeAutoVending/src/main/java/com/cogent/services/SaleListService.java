package com.cogent.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cogent.Dao.SaleListRepository;
import com.cogent.Exception.ResourceNotFoundException;
import com.cogent.dto.SaleList;

@Service
public class SaleListService {
@Autowired
private SaleListRepository saleListRepository;
	

	
	public Optional<SaleList> getSaleListById(int id) throws ResourceNotFoundException{
		
		return saleListRepository.findById(id);
	}

	public List<SaleList> findAll() {
		
		return saleListRepository.findAll();
	}

	public List<SaleList> findAllforToday(int drinkId) {
		
		return saleListRepository.findByToday(drinkId);
	}

	public List<SaleList> findAllbyDrinkId(int drinkId) {
		
		return saleListRepository.findByDrinkId(drinkId);
	}

	public SaleList addSale(SaleList salelist) {
		// TODO Auto-generated method stub
		return saleListRepository.save(salelist);
	}

	

}
