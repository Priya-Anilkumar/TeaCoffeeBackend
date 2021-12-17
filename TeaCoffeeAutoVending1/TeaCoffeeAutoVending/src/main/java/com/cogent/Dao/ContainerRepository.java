package com.cogent.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.dto.Container;
@Repository
public interface ContainerRepository extends JpaRepository<Container, Integer> {

}
