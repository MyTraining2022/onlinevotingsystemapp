package org.society.service;

import java.util.List;

import org.society.dao.ElectionResultDaoImp;
import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ElectionResultServiceImpl implements ElectionResultService {
	@Autowired
	ElectionResultDaoImp dao;
	
	@Override
	public boolean addElectionResult(ElectionResult result) {
		dao.save(result);
		return true;
	}

	@Override
	public boolean updateElectionResult(ElectionResult result) {
		dao.update(result);
		return true;
	}

	@Override
	public boolean deleteElectionResult(ElectionResult result) {
		dao.delete(result);
		return true;

	}

	@Override
	public List<ElectionResult> viewElectionResultList() {
		return dao.getElectionResultList();
	}

	@Override
	public ElectionResult viewCandidatewiseResult(long candidateId) {
		return  dao.getCandidatewiseResult(candidateId);
	}

	@Override
	public double viewVotingPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double viewCandidateVotingPercent(long candidateId) {
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
