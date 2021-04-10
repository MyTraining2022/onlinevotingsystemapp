package org.society.dao;

import java.util.List;

import org.society.entities.Admin;
import org.society.exceptions.NoAdminFoundException;

public interface AdminDao {
	void save(Admin ad);

	boolean update(Admin ad) throws NoAdminFoundException;

	boolean delete(long adminId) throws NoAdminFoundException;

	Admin getAdmin(long adminId) throws NoAdminFoundException;

	List<Admin> getAllAdmin();
}
