package com.kodnest.tunehub.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.User;
import com.kodnest.tunehub.Repository.UserRepository;
import com.kodnest.tunehub.Service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public void saveUser(User user) {

		userRepository.save(user);
	}

	@Override
	public boolean emailExists(User user) {

		User existinguser = userRepository.findByEmail(user.getEmail());

		if(existinguser!=null) {
			System.out.println("Present");

			return true;
		}
		else {
			System.out.println("Absent");
			return false;
		}
	}

	@Override
	public boolean validUser(String email, String password) {

		User user = userRepository.findByEmail(email);

		String dbpwd = user.getPassword();


		if(password.equals(dbpwd)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String getRole(String email) {

		User user = userRepository.findByEmail(email);

		return user.getRole();
	}

	@Override
	public User getUser(String mail) {

		return userRepository.findByEmail(mail);
	}

	@Override
	public void updateUser(User user) {

		
		userRepository.save(user);
	}

	

	@Override
	public void resetPassword(String email, String password) {
	    User user = userRepository.findByEmail(email);
	    if (user != null) {
	        // Update the user's password and clear the reset token
	        user.setPassword(password);
	        user.setResetToken(null);
	        userRepository.save(user);
	    } else {
	        // Handle case where email doesn't exist
	        throw new RuntimeException("User with email " + email + " not found");
	    }
	}
	
	}


