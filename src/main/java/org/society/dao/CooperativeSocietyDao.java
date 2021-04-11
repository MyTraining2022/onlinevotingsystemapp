package org.society.dao;

import java.util.List;

import org.society.entities.CooperativeSociety;
import org.society.exceptions.SocietyNotFoundException;

public interface CooperativeSocietyDao {
	
	public void save(CooperativeSociety society);

	public boolean update(CooperativeSociety society) throws SocietyNotFoundException;

	public boolean delete(int societyId) throws SocietyNotFoundException;

	public List<CooperativeSociety> getAll();

	public CooperativeSociety getById(int societyId) throws SocietyNotFoundException;
}
