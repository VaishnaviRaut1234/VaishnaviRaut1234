package com.cg.placementservice;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController 
{
	@Autowired
	private PlacementService service;
	
	//Retrieve All the Rows from database
	@GetMapping("/placement")
	public List<Placement> list()
	{
		return service.listAll();
		
	}
	
	//Retrieve Specific records from database
	
	@GetMapping("/placement/{id}")
	public ResponseEntity<Placement> get (@PathVariable Integer id)
	{
		
		Placement placement = service.get(id);
		return new ResponseEntity<Placement>(placement, HttpStatus.OK); 
	
	}
	
	//Create a Row in database
	@PostMapping("/placement")
	public void add(@RequestBody Placement placement)
	{
		service.save(placement);
		
	}
	
	//Update ID
	@PutMapping("/placement/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Integer id)
	{
		try 
		{
			Placement existPlacement = service.get(id);
			service.save(placement);
			return new ResponseEntity<Placement>(placement, HttpStatus.OK);
		}
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete ID
	@DeleteMapping("/placement/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
