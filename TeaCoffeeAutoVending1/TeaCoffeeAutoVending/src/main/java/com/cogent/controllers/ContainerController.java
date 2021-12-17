package com.cogent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Exception.ResourceNotFoundException;
import com.cogent.dto.Container;
import com.cogent.services.ContainerService;

@RestController
public class ContainerController {
	@Autowired
	private ContainerService containerService;
	
	@GetMapping("/getContainer/{id}")
	public ResponseEntity<Container> getContainerById(@PathVariable("id") int id) throws ResourceNotFoundException {
		
	 Container container =containerService.getContainerById(id)
	 .orElseThrow(()->new ResourceNotFoundException("Container not found"+id));
	 return ResponseEntity.created(null).body(container);		
	}
	
	@PutMapping("/updateContainer")
	public ResponseEntity<Container> updateContainer(@RequestBody Container container) throws ResourceNotFoundException{
		
		return ResponseEntity.created(null).body(containerService.updateContainer(container));
				
	}
	

}
