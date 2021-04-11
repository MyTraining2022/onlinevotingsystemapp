package org.society.dao;

import java.util.List;

import org.society.entities.VotedList;
import org.society.exceptions.CastedVoteNotFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.exceptions.VoterNotFoundException;

public interface VotedListDao {
	public int castVotedList(VotedList votedList);

	public boolean updateVotedListDetails(VotedList votedList) throws CastedVoteNotFoundException;

	public boolean deletedVotedListDetails(long id) throws CastedVoteNotFoundException;

	public List<VotedList> viewVotedList();

	public VotedList searchByVoterId(String voterId) throws VoterNotFoundException;

	public List<VotedList> searchByNominatedCandidateId(long candidateId) throws NominatedCandidateNotFoundException;
}
