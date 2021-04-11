package org.society.controller;

import org.society.entities.ElectionOfficer;
import org.society.service.ElectionOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ElectionOfficer")
public class ElectionOfficerController {
	
	@Autowired
	ElectionOfficerService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<?> getElectionOfficerById(@PathVariable("id") long id) {
		ElectionOfficer officer = service.viewElectionOfficerById(id);

		return new ResponseEntity<ElectionOfficer>(officer, HttpStatus.OK);
	}
}