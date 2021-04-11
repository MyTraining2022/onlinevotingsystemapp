package org.society.service;

import java.util.List;

import org.society.entities.ElectionOfficer;

public interface ElectionOfficerService {

	public ElectionOfficer addElectionOfficerDetails(ElectionOfficer officer);

	public ElectionOfficer updateElectionOfficerDetails(ElectionOfficer officer);

	public boolean deleteElectionOfficer(int officerId);

	public ElectionOfficer viewElectionOfficerById(int officerId);

	public List<ElectionOfficer> viewElectionOfficerList();
	
	
}
