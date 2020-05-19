package service;

import java.util.List;

import entity.User;

public interface UserService {
	//
	User login(User user);
	boolean register(User user);
	User find(String loginId);
	List<User> findAll();
	boolean modify(User user);
}
