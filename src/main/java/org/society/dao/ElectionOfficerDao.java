package org.society.dao;

import java.util.List;

import org.society.entities.ElectionOfficer;
import org.society.exceptions.ElectionOfficerNotFoundException;

public interface ElectionOfficerDao {
	
	public void save(ElectionOfficer officer);

	public boolean update(ElectionOfficer officer) throws ElectionOfficerNotFoundException;

	public boolean delete(int officerId) throws ElectionOfficerNotFoundException;

	public ElectionOfficer getElectionOfficerById(int officerId) throws ElectionOfficerNotFoundException;

	public List<ElectionOfficer> getElectionOfficerList();
	
}
