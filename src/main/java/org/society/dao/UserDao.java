package org.society.dao;

import java.util.List;

import org.society.entities.User;
import org.society.exceptions.UserNotFoundException;

public interface UserDao {
	public int registerUser(User user);
	public int updateUser(User user) throws UserNotFoundException;
	public int deleteUser(long userId) throws UserNotFoundException;
	public List<User> viewUserList();
	public User findByUserId(long userId) throws UserNotFoundException;
}
