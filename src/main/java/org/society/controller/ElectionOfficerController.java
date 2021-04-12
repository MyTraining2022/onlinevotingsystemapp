package org.society.controller;

import java.util.List;

import javax.validation.Valid;

import org.society.entities.ElectionOfficer;
import org.society.exceptions.EmptyDataException;
import org.society.service.ElectionOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping("/api/ElectionOfficer")
public class ElectionOfficerController {
	
	@Autowired
	private ElectionOfficerService service;
	
	
	@GetMapping(value = "{id}")
	public ResponseEntity<?> getElectionOfficerById(@PathVariable("id") long id) {
		
		ElectionOfficer officer = service.viewElectionOfficerById(id);
		return new ResponseEntity<ElectionOfficer>(officer, HttpStatus.OK);
	}
	
	@GetMapping
	public List<ElectionOfficer> getListOfElectionOfficer() {
		
		List<ElectionOfficer> officerList = service.viewElectionOfficerList();
		if (officerList.size() == 0) {
			throw new EmptyDataException("No Election officer in database!");
		}
		return officerList;
	}
	
	@PostMapping
	public String addElectionOfficerDetails(@Valid @RequestBody ElectionOfficer officer) {
		
		
		service.addElectionOfficerDetails(officer);
		return "Election Officer Details added successfully!";
		
	}
	
	@PutMapping
	public String updateElectionOfficerDetails(@Valid @RequestBody ElectionOfficer officer) {
		
		service.updateElectionOfficerDetails(officer);
		
		return "Election Officer details updated successfully!";
		
	}
	
	@DeleteMapping(value = "{id}")
	public String deleteElectionOfficerDetailsById(@PathVariable("id") long id) {
		service.deleteElectionOfficer(id);
		
		return "Election Officer details removed!";
	}
}