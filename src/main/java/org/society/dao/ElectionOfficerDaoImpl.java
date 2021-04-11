package org.society.dao;

import java.util.List;

import org.society.entities.ElectionOfficer;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.ElectionOfficerNotFoundException;
import org.society.repository.ElectionOfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ElectionOfficerDaoImpl implements ElectionOfficerDao {
	
	@Autowired
	ElectionOfficerRepository repository;

	@Override
	public ElectionOfficer  save(ElectionOfficer officer) {
		if(repository.existsById(officer.getId())) {
			throw new DuplicateEntityFoundException("Save operation","Duplicate Election Officer can not be saved");
		}
			return repository.save(officer);
		
		
	}

	@Override
	public boolean update(ElectionOfficer officer) throws ElectionOfficerNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(long officerId) throws ElectionOfficerNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ElectionOfficer getElectionOfficerById(long officerId) throws ElectionOfficerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ElectionOfficer> getElectionOfficerList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}