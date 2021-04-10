/*
 * Author- Govind Kidambi
 */

package org.society.service;

import java.util.List;

import org.society.dao.NominatedCandidatesDaoImpl;
import org.society.entities.NominatedCandidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NominatedCandidatesServiceImpl implements NominatedCandidatesService {

	@Autowired
	NominatedCandidatesDaoImpl dao;

	@Override
	public void addNominatedCandidate(NominatedCandidates candidate) {
		dao.save(candidate);
	}

	@Override
	public boolean updateNominatedCandidateDetails(NominatedCandidates candidate) {
		dao.update(candidate);
		return true;
	}

	@Override
	public boolean deleteNominatedCandididate(int candidateId) {
		dao.delete(candidateId);
		return true;
	}

	@Override
	public List<NominatedCandidates> getNominatedCandidatesList() {
	return dao.viewNominatedCandidatesList();
	}

	@Override
	public NominatedCandidates getByCandidateId(int id) {
		return  dao.searchByCandidateId(id);
	}

}
