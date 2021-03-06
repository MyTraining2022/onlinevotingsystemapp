package org.society.service;

import java.util.List;

import org.society.dao.UserDaoImpl;
import org.society.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDaoImpl dao;

	@Override
	public User save(User user) {
		
		return dao.save(user);
	}

	@Override
	public User update(User user) {
		
		return dao.update(user);
	}

	@Override
	public boolean delete(long userId) {
		
		return dao.delete(userId);
	}

	@Override
	public List<User> viewUserList() {
		
		return dao.viewUserList();
	}

	@Override
	public User findByUserId(long userId) {
		
		return dao.findByUserId(userId);
	}

}
