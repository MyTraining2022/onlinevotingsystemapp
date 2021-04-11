package org.society.dao;

import java.util.List;

import org.society.entities.RegisteredSocietyVoters;
import org.society.exceptions.VoterNotFoundException;

public interface RegisteredSocietyVotersDao {
	public void save(RegisteredSocietyVoters voter);

	public boolean update(RegisteredSocietyVoters voter) throws VoterNotFoundException;

	public boolean delete(long voterId) throws VoterNotFoundException;

	public List<RegisteredSocietyVoters> viewRegisteredVoterList();

	public RegisteredSocietyVoters searchByVoterID(long voterId) throws VoterNotFoundException;

	//public RegisteredSocietyVoters loginValidate(String userid, String password) throws VoterNotFoundException;
}
