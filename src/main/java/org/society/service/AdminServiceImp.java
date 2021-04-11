package org.society.service;

import org.society.dao.AdminDaoImp;

import org.society.entities.Admin;
import org.society.entities.ElectionOfficer;
import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImp implements AdminService {

	@Autowired
	AdminDaoImp dao;

	@Override
	public void addAdminDetails(Admin officer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateAdminDetails(Admin officer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmin(long adminID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin viewAdminById(long adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addElectionOfficerDetails(ElectionOfficer officer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateElectionOfficerDetails(ElectionOfficer officer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElectionOfficer(long officerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addElectionResult(ElectionResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateElectionResult(ElectionResult result) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElectionResult(ElectionResult result) {
		// TODO Auto-generated method stub
		return false;
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

	

}
