package com.cogent.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cogent.dto.Refill;
@Repository
public interface RefillRepository extends JpaRepository<Refill, Integer> {

	@Query("SELECT r from Refill r where DATE_FORMAT(r.date,'%Y-%M-%d') = DATE_FORMAT(current_date,'%Y-%M-%d')")
	List<Refill> findByToday();

}
