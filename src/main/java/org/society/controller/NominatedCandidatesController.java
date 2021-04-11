package org.society.controller;

import org.society.entities.NominatedCandidates;
import org.society.entities.RegisteredSocietyVoters;
import org.society.service.NominatedCandidatesService;
import org.society.service.RegisteredSocietyVotersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Nominated Candidates")
public class NominatedCandidatesController {
	@Autowired
	NominatedCandidatesService nominatedCandidatesService;
	
	@GetMapping(value = "{candidateId}")
	public ResponseEntity<?> getCandidateById(@PathVariable("id") long id) {
		NominatedCandidates n = nominatedCandidatesService.searchByCandidateId(id);

		return new ResponseEntity<NominatedCandidates>(n, HttpStatus.OK);
	}


}
