package com.cogent.jwt.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public Optional<User> findUserByName(String username);
	
	public Boolean existsByUsername(String username);
	public  Boolean existsByEmail(String email);
}
