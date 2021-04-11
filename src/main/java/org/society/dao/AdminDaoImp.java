package org.society.dao;

import java.util.List;
import java.util.Optional;

import org.society.entities.Admin;
import org.society.exceptions.DuplicateEntityFoundException;
import org.society.exceptions.NoAdminFoundException;
import org.society.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminDaoImp implements AdminDao {

	@Autowired
	AdminRepository repository;

	@Override
	public void save(Admin ad) throws DuplicateEntityFoundException {
		if (repository.existsById(ad.getId())) {
			throw new DuplicateEntityFoundException("Save Operation","Duplicate Admin Found");
		}
		if (ad != null) {
			repository.save(ad);
		}
	}

	@Override
	public boolean update(Admin ad) throws NoAdminFoundException {
		if (repository.existsById(ad.getId())) {
			repository.save(ad);
			return true;
		} else {
			throw new NoAdminFoundException("No Admin found to Update");
		}
	}

	@Override
	public boolean delete(long adminId) throws NoAdminFoundException {
		if (repository.existsById(adminId)) {
			repository.deleteById(adminId);
			return true;
		} else {
			throw new NoAdminFoundException("No Admin found to delete");
		}
	}

	@Override
	public Admin getAdmin(long adminId) throws NoAdminFoundException {
		Optional<Admin> an = repository.findById(adminId);
		if (an.isPresent()) {
			return an.get();
		}
		return null;
	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> adI = (List<Admin>) repository.findAll();
		return adI;
	}

}
