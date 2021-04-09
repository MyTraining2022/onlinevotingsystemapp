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
public class ElectionResultServiceImp implements ElectionResultDao{
	@Autowired
	ElectionResultRepository repository;
	@Override
	public int addElectionResult(ElectionResult result) {
		if(repository.existsById(result.getId()))
		{
			throw new DuplicateEntityFoundException("Duplicate Election Result found");
		}
		repository.save(result);
		return 1;
	}

	@Override
	public List<ElectionResult> viewElectionResultList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectionResult viewCandidatewiseResult(int candidateId) throws NominatedCandidateNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double viewVotingPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double viewCandidateVotingPercent(int candidateId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayVotingStatistics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NominatedCandidates viewHighestVotingPercentCandidate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NominatedCandidates viewLowestVotingPercentCandidate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int viewInvalidVotes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<NominatedCandidates> candidatewiseInvalidVotesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayPollingResult() {
		// TODO Auto-generated method stub
		
	}

}
