/*
 * Author- Govind Kidambi
 */

package org.society.dao;

import java.util.List;

import org.society.entities.NominatedCandidates;
import org.society.entities.RegisteredSocietyVoters;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.repository.NominatedCandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NominatedCandidatesDaoImpl implements NominatedCandidatesDao {

	@Autowired
	NominatedCandidatesRepository nominatedCandidatesRepository;

	@Override
	public void save(NominatedCandidates candidate) {
		if (nominatedCandidatesRepository.existsById(candidate.getCandidateId())) {
			throw new DuplicateEntityFoundException("Duplicate Candidate can not be saved");
		}
		if (candidate != null) {
			nominatedCandidatesRepository.save(candidate);
		}
//hi help my git
	}

	@Override
	public boolean update(NominatedCandidates candidate)
			throws NominatedCandidateNotFoundException {
		if (nominatedCandidatesRepository.existsById(candidate.getCandidateId())) {
			nominatedCandidatesRepository.save(candidate);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int candidateId) throws NominatedCandidateNotFoundException {
		if (nominatedCandidatesRepository.existsById((long) candidateId)) {
			nominatedCandidatesRepository.deleteById((long) candidateId);
			return true;
		}
		return false;
	}

	@Override
	public List<NominatedCandidates> viewNominatedCandidatesList() {
		List<NominatedCandidates> list = (List<NominatedCandidates>) nominatedCandidatesRepository
				.findAll();
		return list;
	}

	@Override
	public NominatedCandidates searchByCandidateId(int candidateId) throws NominatedCandidateNotFoundException {
		return nominatedCandidatesRepository.findByCandidateId(candidateId);
	}

}
