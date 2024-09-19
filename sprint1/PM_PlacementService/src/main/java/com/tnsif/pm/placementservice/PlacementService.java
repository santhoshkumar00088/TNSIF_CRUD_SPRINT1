package com.tnsif.pm.placementservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementService 
{
	@Autowired
	private PlacementRepository repo;
	
	public List<Placement>listAll()
	{
		return repo.findAll();
	}
	public Placement get(Long id)
	{
		return repo.findById(id).get();
	}
	public void save(Placement placement)
	{
	  repo.save(placement);
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
}
