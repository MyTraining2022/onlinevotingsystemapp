package org.society.controller;

import org.society.entities.RegisteredSocietyVoters;
import org.society.service.ElectionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisteredSocietyVotersController {

	@Autowired
	RegisteredSocietyVotersS service;
}
