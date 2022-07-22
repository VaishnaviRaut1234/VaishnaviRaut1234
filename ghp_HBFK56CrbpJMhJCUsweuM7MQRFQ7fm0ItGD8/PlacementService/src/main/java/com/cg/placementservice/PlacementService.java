package com.cg.placementservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlacementService 
{
	@Autowired
	private PlacementReposetory repository;
	
	public List<Placement> listAll()
	{
		
		return repository.findAll();
	}

	public Placement get(Integer id) {
		
		return repository.findById(id).get();
	}

	public void save(Placement placement) 
	{
		repository.save(placement);
		
	}

	public void delete(Integer id) 
	{
		
		repository.deleteById(id);
	}

}
