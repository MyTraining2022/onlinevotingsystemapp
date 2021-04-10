/*
 * @author: Aditya Mohapatra
 */

package org.society.dao;

import java.util.List;

import org.society.entities.VotedList;
import org.society.exceptions.CastedVoteNotFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.exceptions.VoterNotFoundException;
import org.society.repository.VotedListRepository;

public class VotedListDaoImpl implements VotedListDao{

	VotedListRepository votedListRepository;
	
	@Override
	public int castVotedList(VotedList votedList) {
		return 0;
	}

	@Override
	public boolean updateVotedListDetails(VotedList votedList) throws CastedVoteNotFoundException {
		if(votedListRepository.existsById(votedList.getId())) {
			votedListRepository.save(votedList);
			return true;
		}
		return false;
	}

	@Override
	public boolean deletedVotedListDetails(int id) throws CastedVoteNotFoundException {
		if(votedListRepository.existsById((long) id)) {
			votedListRepository.deleteById((long) id);
			return true;
		}
		return false;
	}

	@Override
	public List<VotedList> viewVotedList() {
		List<VotedList> list = (List<VotedList>) votedListRepository.findAll();
		return list;
	}

	@Override
	public VotedList searchByVoterId(int voterId) throws VoterNotFoundException {
		return votedListRepository.findById(voterId);
	}

	@Override
	public List<VotedList> searchByNominatedCandidateId(int candidateId) throws NominatedCandidateNotFoundException {
		return null;
	}

}