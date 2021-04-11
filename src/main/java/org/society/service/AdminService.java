package org.society.service;

import java.util.List;

import org.society.entities.Admin;
import org.society.entities.ElectionOfficer;
import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;

public interface AdminService {
	public void addAdminDetails(Admin officer);

	public boolean updateAdminDetails(Admin officer);

	public boolean deleteAdmin(long adminID);

	public Admin viewAdminById(long adminId);

	public boolean addElectionOfficerDetails(ElectionOfficer officer);

	public boolean updateElectionOfficerDetails(ElectionOfficer officer);

	public boolean deleteElectionOfficer(long officerId);

	public void addElectionResult(ElectionResult result);

	public boolean updateElectionResult(ElectionResult result);

	public boolean deleteElectionResult(ElectionResult result);
	public boolean addNominatedCandidate(NominatedCandidates candidate);

	public void updateNominatedCandidateDetails(NominatedCandidates candidate);

	public void deleteNominatedCandididate(long candidateId);
	
}
