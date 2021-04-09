package org.society.service;

import java.util.List;

import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;

public class ElectionResultServiceImpl implements ElectionResultService{

	@Override
	public int addElectionResult(ElectionResult result) {
		
	}

	@Override
	public List<ElectionResult> viewElectionResultList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectionResult viewCandidatewiseResult(int candidateId) {
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
