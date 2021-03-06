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
import org.springframework.stereotype.Component;

@Component
public class RegisteredSocietyVotersDaoImpl implements RegisteredSocietyVotersDao {

	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;

	@Override
	public RegisteredSocietyVoters save(RegisteredSocietyVoters voter) {
		if (registeredSocietyVotersRepository.existsById(voter.getId())) {
			throw new DuplicateEntityFoundException("Duplicate Voter can not be saved");
		}
		return registeredSocietyVotersRepository.save(voter);
		
	}

	@Override
	public RegisteredSocietyVoters update(RegisteredSocietyVoters voter) throws VoterNotFoundException {
		if (registeredSocietyVotersRepository.existsById(voter.getId())) 
			registeredSocietyVotersRepository.save(voter);
			
		return registeredSocietyVotersRepository.save(voter);
	}

	@Override
	public boolean delete(long voterId) throws VoterNotFoundException {
		if (registeredSocietyVotersRepository.existsById(voterId)) {
			registeredSocietyVotersRepository.deleteById(voterId);
		}
		if (registeredSocietyVotersRepository.existsById( voterId)) {
			registeredSocietyVotersRepository.deleteById( voterId);
			return true;
		}
		return false;
	}

	@Override
	public List<RegisteredSocietyVoters> getRegisteredVoterList() {
		List<RegisteredSocietyVoters> list = (List<RegisteredSocietyVoters>) registeredSocietyVotersRepository
				.findAll();
		return list;
	}

	@Override
	public RegisteredSocietyVoters getByVoterID(long voterId) throws VoterNotFoundException {
		return registeredSocietyVotersRepository.findById(voterId);
	}
	
	/*
	 * @Override public RegisteredSocietyVoters loginValidate(String userid, String
	 * password) throws VoterNotFoundException { return null; }
	 */
}