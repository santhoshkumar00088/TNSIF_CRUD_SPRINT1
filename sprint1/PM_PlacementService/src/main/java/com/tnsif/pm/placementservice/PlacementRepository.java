package com.tnsif.pm.placementservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
	//All CRUD

}
/*
 * findall()
 * findById()
 * save()
 * deleteById()
 */