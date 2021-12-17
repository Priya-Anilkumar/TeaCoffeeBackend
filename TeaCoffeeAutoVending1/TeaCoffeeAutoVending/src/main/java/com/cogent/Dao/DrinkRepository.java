package com.cogent.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.dto.Drink;
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {

}
