package org.society.service;

import org.society.dao.AdminDaoImp;
import org.society.dao.ElectionOfficerDaoImpl;
import org.society.dao.ElectionResultDaoImpl;
import org.society.entities.Admin;
import org.society.entities.CooperativeSociety;
import org.society.entities.ElectionOfficer;
import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.society.entities.RegisteredSocietyVoters;
import org.society.entities.User;
import org.society.entities.VotedList;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImp implements AdminService {

	@Autowired
	AdminDaoImp daoAdmin;
	@Autowired
	ElectionOfficerDaoImpl daoElectionOfficer;
	@Autowired
	ElectionResultDaoImpl daoElectionResult;
	@Autowired
	//NominatedCandidateDaoImp daoNominatedCandidate;
	
	@Override
	public void addAdminDetails(Admin admin) {
		daoAdmin.save(admin);
		
	}
	@Override
	public boolean updateAdminDetails(Admin admin) {
		daoAdmin.update(admin);
		return true;
	}
	@Override
	public boolean deleteAdmin(long adminID) {
		daoAdmin.delete(adminID);
		return true;
	}
	@Override
	public Admin viewAdminById(long adminId) {
		return daoAdmin.getAdmin(adminId);
		 
	}
	@Override
	public boolean addElectionOfficerDetails(ElectionOfficer officer) {
		daoElectionOfficer.save(officer);
		return true;
	}
	@Override
	public boolean updateElectionOfficerDetails(ElectionOfficer officer) {
		daoElectionOfficer.update(officer);
		return true;
	}
	@Override
	public boolean deleteElectionOfficer(long officerId) {
		daoElectionOfficer.delete(officerId);
		return false;
	}
	@Override
	public void addElectionResult(ElectionResult result) {
		daoElectionResult.save(result);
		
	}
	@Override
	public boolean updateElectionResult(ElectionResult result) {
		daoElectionResult.update(result);
		return true;
	}
	@Override
	public boolean deleteElectionResult(ElectionResult result) {
		daoElectionResult.delete(result);
		return true;
	}
	@Override
	public boolean addNominatedCandidate(NominatedCandidates candidate) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateNominatedCandidateDetails(NominatedCandidates candidate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteNominatedCandididate(long candidateId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addSocietyDetails(CooperativeSociety society) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateSocietyDetails(CooperativeSociety society) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteSociety(long societyId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void voterRegistration(RegisteredSocietyVoters voter) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateRegisteredVoterDetails(RegisteredSocietyVoters voter) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteRegisteredVoter(long voterId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteUser(long userId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void castVotedList(VotedList votedList) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateVotedListDetails(VotedList votedList) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deletedVotedListDetails(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
