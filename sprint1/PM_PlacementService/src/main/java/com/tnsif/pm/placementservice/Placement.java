package com.tnsif.pm.placementservice;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	private Long id;
	private String companyName;
	private String jobtitle;
	private LocalDate placementDate;
	private Long studentId;
	
	//constructor
	public Placement() {
		
	}

	public Placement(Long id, String companyName, String jobtitle, LocalDate placementDate, Long studentId) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobtitle = jobtitle;
		this.placementDate = placementDate;
		this.studentId = studentId;
	}
//getter setter
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public LocalDate getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(LocalDate placementDate) {
		this.placementDate = placementDate;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}
