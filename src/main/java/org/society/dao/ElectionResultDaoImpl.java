package org.society.dao;

import java.util.List;
import java.util.Optional;

import org.society.entities.ElectionResult;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.ElectionResultNotFoundException;
import org.society.exceptions.NominatedCandidateNotFoundException;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectionResultDaoImpl implements ElectionResultDao {
	@Autowired
	ElectionResultRepository repository;

	@Override
	public ElectionResult save(ElectionResult result) {
		if (repository.existsById(result.getId())) {
			throw new DuplicateEntityFoundException("Save operation","Duplicate Election Result found");
		}
		return repository.save(result);

	}

	@Override
	public boolean update(ElectionResult result) {
		if (repository.existsById(result.getId())) {
			repository.save(result);
			return true;
		} else {
			throw new ElectionResultNotFoundException("No Election Result found");
		}
	}

	@Override
	public boolean delete(ElectionResult result) {
		if (repository.existsById(result.getId())) {
			repository.delete(result);
			return true;
		} else {
			throw new ElectionResultNotFoundException("No Election Result found");
		}
	}

	@Override
	public List<ElectionResult> getElectionResultList() {
		List<ElectionResult> list = (List<ElectionResult>) repository.findAll();
		return list;
	}

	@Override
	public ElectionResult getCandidatewiseResult(long candidateId) {
		Optional<ElectionResult> er = repository.findById(candidateId);
		if (er.isPresent()) {
			return er.get(); // how to get result
		} else {
			throw new NominatedCandidateNotFoundException(
					"For this Id " + candidateId + " There is no Nominated Candidate ");
		}
	}
}
