package com.cogent.jwt.Repositories;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.ERole;

public interface RoleRepository extends JpaRepository<Role, Long>{
public Optional<Role> findByName(ERole name);
}
