package com.cogent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.dto.Refill;
import com.cogent.services.RefillService;

@RestController
public class RefillController {
	@Autowired
	private RefillService refillService;
	
	@PostMapping("/refill")
	public ResponseEntity<Refill> refillContainer(@RequestBody Refill refill) {
		return ResponseEntity.created(null).body(refillService.fillContainer(refill));			
	}

	@GetMapping("/refillStatus/today")
	public ResponseEntity<List<Refill>> getTodayRefill(){
		return ResponseEntity.created(null).body(refillService.getTodayRefill());
	}
	
	@GetMapping("/refillStatus/AllDays")
	public ResponseEntity<List<Refill>> getAllDaysRefill(){
		return ResponseEntity.created(null).body(refillService.getAllRefill());
	}
	
}
