package com.cogent.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.Dao.RefillRepository;
import com.cogent.dto.Refill;

@Service
public class RefillService {

	@Autowired
	private RefillRepository refillRepository;	
	


	public Refill fillContainer(Refill refill) {
		return refillRepository.save(refill);
		
	}



	public List<Refill> getTodayRefill() {
		
		return refillRepository.findByToday();
	}



	public List<Refill>  getAllRefill() {
		
		return refillRepository.findAll();
	}

}
