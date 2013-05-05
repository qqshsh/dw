package com.dw.service;
import com.dw.dao.interfaces.UserDAO;
import com.dw.entity.User;
import com.dw.util.Encrypter;
public class UserServiceImpl {
	private UserDAO userDAO;
	public UserServiceImpl(UserDAO userDAO){
		this.userDAO = userDAO;
	}
	public void addUSer(User user){
		user.setPassword(Encrypter.md5(user.getPassword()));
		userDAO.addUser(user);
	}
}
