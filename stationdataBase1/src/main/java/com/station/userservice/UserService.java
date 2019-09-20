package com.station.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.User;
import com.users.dao.UserDao;

@Service
public class UserService {

	
	@Autowired
	private UserDao userdao;
	//signing up
	public User addUser(User user) {
		userdao.save(user);
		
		return user;
	}
	
	//for login validation
	public String validateUser(Long userid,String password) {
		User user = userdao.findOne(userid);
		//System.out.println(user);
		// && user.getPassword()==password
		//user.getUserId()==userid
		if(user.getPassword().equals(password)) {
			//System.out.println("redirecting to the dashboard");
			return "redirecting to the dashboard";
		}
		
		return "Invalid User";
		
	}
	
	public Iterable<User> getAll() {
		return userdao.findAll();
	}
	
	
}
