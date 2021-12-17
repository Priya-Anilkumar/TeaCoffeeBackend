package com.cogent.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.cogent.Dao.DrinkRepository;
import com.cogent.dto.Drink;

@Service
public class DrinkService {

	@Autowired
	private DrinkRepository drinkRepository;

	public List<Drink> getAllDrinks() {
		
		return drinkRepository.findAll();
	}

	public Optional<Drink> getDrinkbyId(int id) throws ResourceNotFoundException{
		
		return drinkRepository.findById(id);
	}
	
	
	
}
