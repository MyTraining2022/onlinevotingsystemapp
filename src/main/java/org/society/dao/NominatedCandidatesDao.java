package org.society.dao;

import java.util.List;

import org.society.entities.NominatedCandidates;
import org.society.exceptions.NominatedCandidateNotFoundException;

public interface NominatedCandidatesDao {
	public NominatedCandidates save(NominatedCandidates candidate);
	public NominatedCandidates update(NominatedCandidates candidate) throws NominatedCandidateNotFoundException;
	public boolean delete(long candidateId) throws NominatedCandidateNotFoundException;
	public List<NominatedCandidates> getNominatedCandidatesList();
	public NominatedCandidates searchByCandidateId(long id)throws NominatedCandidateNotFoundException;
}
