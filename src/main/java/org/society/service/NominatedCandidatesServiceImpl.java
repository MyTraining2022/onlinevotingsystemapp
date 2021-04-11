package org.society.service;

import java.util.List;

import org.society.dao.ElectionResultDaoImpl;
import org.society.dao.NominatedCandidatesDaoImpl;
import org.society.entities.NominatedCandidates;
import org.springframework.beans.factory.annotation.Autowired;

public class NominatedCandidatesServiceImpl implements NominatedCandidatesService {
	@Autowired
	NominatedCandidatesDaoImpl dao;

	@Override
	public void saveNominatedCandidate(NominatedCandidates candidate) {
       dao.save(candidate);		
	}

	@Override
	public boolean updateNominatedCandidateDetails(NominatedCandidates candidate) {
		dao.update(candidate);
		return false;
	}

	@Override
	public boolean deleteNominatedCandididate(int candidateId) {
		dao.delete(candidateId);
		return false;
	}

	@Override
	public List<NominatedCandidates> viewNominatedCandidatesList() {
		return dao.getNominatedCandidatesList();
	}

	@Override
	public NominatedCandidates searchByCandidateId(int id) {
		return null;
	}
}
	

	