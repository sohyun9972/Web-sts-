package store;

import java.util.List;

import entity.User;

public interface UserStore {
	//
	boolean create(User user);
	User read(String id);
	List<User> readAll();
	boolean update(User user);
}
