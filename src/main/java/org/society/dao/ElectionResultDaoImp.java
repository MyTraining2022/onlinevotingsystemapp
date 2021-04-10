package org.society.dao;

import java.util.List;

import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ElectionResultDaoImp implements ElectionResultDao{
	@Autowired
	ElectionResultRepository repository;
	@Override
	public void addElectionResult(ElectionResult result)throws DuplicateEntityFoundException {
		if(repository.existsById(result.getId()))
		{
			throw new DuplicateEntityFoundException("Duplicate Election Result found");
		}
		repository.save(result);
		
	}
	@Override
	public List<ElectionResult> viewElectionResultList() {
		List<ElectionResult> list =(List<ElectionResult>) repository.findAll();
		return list;
	}

	@Override
	public ElectionResult viewCandidatewiseResult(long candidateId) throws NominatedCandidateNotFoundException {
		if(repository.existsById(candidateId))
		{
			
		}
		else
		{
			throw new NominatedCandidateNotFoundException("For this Id "+ candidateId +" There is no Nominated Candidate ");
		}
		return null;
	}

}
