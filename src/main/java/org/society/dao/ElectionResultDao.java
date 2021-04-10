package org.society.dao;

import java.util.List;

import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.society.exceptions.NominatedCandidateNotFoundException;

public interface ElectionResultDao {
	public void addElectionResult(ElectionResult result);
	public List<ElectionResult> viewElectionResultList();
	public ElectionResult viewCandidatewiseResult(long candidateId) throws NominatedCandidateNotFoundException;
	//public double viewVotingPercentage();
	//public double viewCandidateVotingPercent(long candidateId);
	//public void displayVotingStatistics();
	//public NominatedCandidates viewHighestVotingPercentCandidate();
	//public NominatedCandidates viewLowestVotingPercentCandidate();
	//public int viewInvalidVotes();
	//public List<NominatedCandidates> candidatewiseInvalidVotesList();
	//public void displayPollingResult();
	
	
}
