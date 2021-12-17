package com.cogent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cogent.Exception.ResourceNotFoundException;


import com.cogent.dto.Drink;
import com.cogent.services.DrinkService;

@RestController
public class DrinkController {
	@Autowired
	private DrinkService drinkService;
	
	
	@GetMapping("/allDrinks")
	public ResponseEntity<List<Drink>> getAllDrinks(){
		return  ResponseEntity.created(null).body(drinkService.getAllDrinks());
	}
	
	@GetMapping("/allDrink/{id}")
	public ResponseEntity<Drink> getDrinkById(@PathVariable int id) throws ResourceNotFoundException{
		Drink drink1=drinkService.getDrinkbyId(id)
				.orElseThrow(()->new ResourceNotFoundException("Drink not found found"+id));
		return ResponseEntity.created(null).body(drink1);
	}
	
	

}
