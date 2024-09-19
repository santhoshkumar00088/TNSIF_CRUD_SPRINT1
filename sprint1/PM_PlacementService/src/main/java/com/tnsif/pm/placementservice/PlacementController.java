package com.tnsif.pm.placementservice;

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
	
	//Restfull API Methods for retrieval Operations
	
	@GetMapping("/placements")
	public List<Placement> list()
	{
		return service.listAll();
	}
	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable long id)
	{
		try
		{
			Placement placement=service.get(id);
			return new ResponseEntity<Placement>(placement,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	//Create Operation
	@PostMapping("/placements")
	public void add(@RequestBody Placement placement)
	{
		service.save(placement);
		
	}
	//Restful API method for update operation
	@PutMapping("/placements/{id}")
	public ResponseEntity<?>update(@RequestBody Placement placement,@PathVariable long id)
	{
		try
		{
			Placement existPlacement=service.get(id);
			service.save(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Restful API method for update operation
	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable long id)
	{
		service.delete(id);
	}
	
}
