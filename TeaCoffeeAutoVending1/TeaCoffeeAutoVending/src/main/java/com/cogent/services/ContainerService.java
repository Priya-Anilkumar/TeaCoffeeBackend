package com.cogent.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.Dao.ContainerRepository;
import com.cogent.Exception.ResourceNotFoundException;
import com.cogent.dto.Container;

@Service
public class ContainerService {
@Autowired
private ContainerRepository containerRepository;
	
	public Optional<Container> getContainerById(int id) {
		// TODO Auto-generated method stub
		return containerRepository.findById(id);
	}

	public Container updateContainer(Container container) throws ResourceNotFoundException{
		Container temp = containerRepository.findById(container.getId())
		.orElseThrow(() -> new ResourceNotFoundException("Container not found for this id :: "+container.getId()));
		
		return containerRepository.save(container);
	}

}
