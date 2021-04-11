package org.society.dao;

import java.util.List;

import org.society.entities.NominatedCandidates;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.repository.NominatedCandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NominatedCandidatesDaoImpl implements NominatedCandidatesDao {
	@Autowired
	NominatedCandidatesRepository nominatedCandidatesRepository;

	@Override
	public NominatedCandidates save(NominatedCandidates candidate) {

		if (nominatedCandidatesRepository.existsById(candidate.getCandidateId())) {
			throw new DuplicateEntityFoundException("Duplicate Candidate can not be saved");
		}
		
	  return	nominatedCandidatesRepository.save(candidate);
		}
		

	@Override
	public NominatedCandidates update(NominatedCandidates candidate)
			throws NominatedCandidateNotFoundException {
		if (nominatedCandidatesRepository.existsById(candidate.getCandidateId())) {
			nominatedCandidatesRepository.save(candidate);
			 
		}
		return nominatedCandidatesRepository.save(candidate);
		
	}

	@Override
	public boolean delete(long candidateId) throws NominatedCandidateNotFoundException {

		if (nominatedCandidatesRepository.existsById((long) candidateId)) {
			nominatedCandidatesRepository.deleteById((long) candidateId);
			return true;
		}
		return false;		
	}

	@Override
	public List<NominatedCandidates> getNominatedCandidatesList() {
		List<NominatedCandidates> list = (List<NominatedCandidates>) nominatedCandidatesRepository
				.findAll();
		return list;
	}

	@Override
	public NominatedCandidates searchByCandidateId(long candidateId) throws NominatedCandidateNotFoundException {
		return nominatedCandidatesRepository.findByCandidateId(candidateId);
	
	}

}
