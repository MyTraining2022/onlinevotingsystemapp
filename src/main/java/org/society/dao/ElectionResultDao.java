package org.society.dao;

import java.util.List;

import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.society.exceptions.ElectionOfficerNotFoundException;
import org.society.exceptions.ElectionResultNotFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;

public interface ElectionResultDao {
	public void save(ElectionResult result);
	
	public boolean update(ElectionResult result) throws ElectionResultNotFoundException;
	
	public boolean delete(ElectionResult result) throws ElectionResultNotFoundException;
	
	public List<ElectionResult> getElectionResultList();

	public ElectionResult viewCandidatewiseResult(long candidateId) throws NominatedCandidateNotFoundException;
	
	
}
