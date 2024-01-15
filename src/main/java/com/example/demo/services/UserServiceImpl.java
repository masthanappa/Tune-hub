package com.example.demo.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitis.Users;
import com.example.demo.repositry.UsersrRepositry;

@Service
public class UserServiceImpl  implements UserService{
	@Autowired
UsersrRepositry repo;

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "user added success";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email) == null) {
			return false;
			
		}
		else {
			return true;
		}
	
	}

	@Override
	public boolean validateUser(String email, String password) {
		Users user = repo.findByEmail(email);
		String dp_pass= user.getPassword();
		if(password.equals(dp_pass)) {
			return true;
		}
		else {
			return false;
		}

	}

	@Override
	public String getRoll(String email) {
		Users user = repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public Users getUser(String email) {
	return	repo.findByEmail(email);
		
	}

	@Override
	public void  updateUser(Users user) {
          repo.save(user);
	
	}
	

}
