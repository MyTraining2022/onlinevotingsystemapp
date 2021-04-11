package org.society.controller;

import javax.validation.Valid;

import org.society.entities.ElectionResult;
import org.society.service.ElectionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectionResultController {
	@Autowired
	ElectionResultService service;

	@PostMapping // (consumes = { MediaType.APPLICATION_XML_VALUE,
					// MediaType.APPLICATION_JSON_VALUE })
	public String saveElectionResult(@Valid @RequestBody ElectionResult result) {
		service.addElectionResult(result);
		return "Election Result successfully saved";
	}

}