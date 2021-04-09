package org.society.dao;

import java.util.List;

import org.society.entities.ElectionOfficer;
import org.society.exceptions.ElectionOfficerNotFoundException;

public class ElectionOfficerDaoImpl implements ElectionOfficerDao {

	@Override
	public int addElectionOfficerDetails(ElectionOfficer officer) {
		
		return 0;
	}

	@Override
	public int updateElectionOfficerDetails(ElectionOfficer officer) throws ElectionOfficerNotFoundException {
		
		return 0;
	}

	@Override
	public int deleteElectionOfficer(int officerId) throws ElectionOfficerNotFoundException {
		
		return 0;
	}

	@Override
	public ElectionOfficer viewElectionOfficerById(int officerId) throws ElectionOfficerNotFoundException {
		
		return null;
	}

	@Override
	public List<ElectionOfficer> viewElectionOfficerList() {
		
		return null;
	}

}
