package com.hari.udemy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.hari.udemy.exceptions.UserExistsException;
import com.hari.udemy.exceptions.UserNotFoundException;
import com.hari.udemy.modal.User;
import com.hari.udemy.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		return userRepository.findAll();

	}

	public User createUser(User user) throws UserExistsException {
		//if user exist use username
		//if not exist throw UserExistsExcepton
	User existingUser=  userRepository.findByUsername(user.getUsername());
	
	if(existingUser!=null)
	{
		throw new UserExistsException("user already exists in repository");
	}
		return userRepository.save(user);

	}

	public Optional<User> getUserById(Long userid) throws UserNotFoundException {
		Optional<User> user = userRepository.findById(userid);

		if (!user.isPresent()) {
			throw new UserNotFoundException("User Not found in user Repository");
		}

		return user;

	}

	public User updateUserById(Long userid, User user) throws UserNotFoundException {
		Optional<User> optionaluser = userRepository.findById(userid);
		if(!optionaluser.isPresent())
		{
			throw new UserNotFoundException("User Not Found in user repository ,provide the correct user id");
		}
		user.setUserid(userid);
		
		return userRepository.save(user);
	}

	public void deleteUserById(Long id) {
		Optional<User> optionaluser = userRepository.findById(id);
		if(!optionaluser.isPresent())
		{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"User Not Found in user repository ,provide the correct user id ok");	
		}
		userRepository.deleteById(id);
	}

	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
