package com.cogent.security.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cogent.jwt.Repositories.UserRepository;
import com.cogent.model.User;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	com.cogent.jwt.Repositories.UserRepository userRepository;
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findUserByName(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

				return UserDetailsImpl.build(user);
	}


}
