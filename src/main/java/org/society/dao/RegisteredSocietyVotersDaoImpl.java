/*
 *@author: Aditya Mohapatra 
 */

package org.society.dao;

import java.util.List;

import org.society.entities.RegisteredSocietyVoters;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.VoterNotFoundException;
import org.society.repository.RegisteredSocietyVotersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisteredSocietyVotersDaoImpl implements RegisteredSocietyVotersDao {

	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;

	@Override
	public void voterRegistration(RegisteredSocietyVoters voter) {
		if (registeredSocietyVotersRepository.existsById(voter.getId())) {
			throw new DuplicateEntityFoundException("Duplicate Voter can not be saved");
		}
		if (voter != null) {
			registeredSocietyVotersRepository.save(voter);
		}
	}

	@Override
	public boolean updateRegisteredVoterDetails(RegisteredSocietyVoters voter) throws VoterNotFoundException {
		if (registeredSocietyVotersRepository.existsById(voter.getId())) {
			registeredSocietyVotersRepository.save(voter);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteRegisteredVoter(int voterId) throws VoterNotFoundException {
		if (registeredSocietyVotersRepository.existsById((long) voterId)) {
			registeredSocietyVotersRepository.deleteById((long) voterId);
			return true;
		}
		return false;
	}

	@Override
	public List<RegisteredSocietyVoters> viewRegisteredVoterList() {
		List<RegisteredSocietyVoters> list = (List<RegisteredSocietyVoters>) registeredSocietyVotersRepository
				.findAll();
		return list;
	}

	@Override
	public RegisteredSocietyVoters searchByVoterID(int voterId) throws VoterNotFoundException {
		return registeredSocietyVotersRepository.findById(voterId);
	}

	@Override
	public RegisteredSocietyVoters loginValidate(String userid, String password) throws VoterNotFoundException {
		return null;
	}

}
