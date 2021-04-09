package org.society.service;

import java.util.List;

import org.society.dao.ElectionOfficerDaoImpl;
import org.society.entities.ElectionOfficer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ElectionOfficerServiceImpl implements ElectionOfficerService {

	@Autowired
	ElectionOfficerDaoImpl dao;
	
	
	@Override
	public boolean addElectionOfficerDetails(ElectionOfficer officer) {
		dao.save(officer);
		return true;
	}

	@Override
	public int updateElectionOfficerDetails(ElectionOfficer officer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteElectionOfficer(int officerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ElectionOfficer viewElectionOfficerById(int officerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ElectionOfficer> viewElectionOfficerList() {
		// TODO Auto-generated method stub
		return null;
	}

}
