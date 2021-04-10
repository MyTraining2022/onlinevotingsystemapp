package org.society.dao;

import java.util.List;

import org.society.entities.NominatedCandidates;
import org.society.exceptions.NominatedCandidateNotFoundException;

public interface NominatedCandidatesDao {
	public void save(NominatedCandidates candidate);
	public boolean update(NominatedCandidates candidate) throws NominatedCandidateNotFoundException;
	public boolean delete(int candidateId) throws NominatedCandidateNotFoundException;
	public List<NominatedCandidates> viewNominatedCandidatesList();
	public NominatedCandidates searchByCandidateId(int id)throws NominatedCandidateNotFoundException;
}
