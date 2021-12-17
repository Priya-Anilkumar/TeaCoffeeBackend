package com.cogent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Exception.ResourceNotFoundException;
import com.cogent.dto.SaleList;
import com.cogent.services.SaleListService;

@RestController
public class SaleListController {
	@Autowired
	private SaleListService saleListService;
	
	
	@PostMapping("/addSaleList")
	public ResponseEntity<SaleList> addSaleList(@RequestBody SaleList salelist) throws ResourceNotFoundException{
		
		return ResponseEntity.created(null).body(saleListService.addSale(salelist));
		
	}
	
	@GetMapping("/getSaleList/{id}")
	public ResponseEntity <SaleList> getSaleListById(@PathVariable("id") int id) throws ResourceNotFoundException {
	 SaleList sl =saleListService.getSaleListById(id).orElseThrow(()->new ResourceNotFoundException("Saleid not found"+id));
	 return ResponseEntity.created(null).body(sl);
	}
	@GetMapping("/getAllSaleList")
	public ResponseEntity <List<SaleList>> getAllSaleList() throws ResourceNotFoundException {		
	 return ResponseEntity.created(null).body(saleListService.findAll());
	}
	@GetMapping("/getTodaySaleList/{drinkId}")
	public ResponseEntity <List<SaleList>> getTodaySaleList(@PathVariable int id) throws ResourceNotFoundException {		
	 return ResponseEntity.created(null).body(saleListService.findAllforToday(id));
	}
	@GetMapping("/getSaleListByDrinkId/{drinkId}")
	public ResponseEntity <List<SaleList>> getSaleListByDrinkId(@PathVariable int id) throws ResourceNotFoundException {		
	 return ResponseEntity.created(null).body(saleListService.findAllbyDrinkId(id));
	}
	
	
	
	
	
	
	

}
