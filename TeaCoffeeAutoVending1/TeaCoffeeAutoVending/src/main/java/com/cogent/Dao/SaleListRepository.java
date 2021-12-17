package com.cogent.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.cogent.dto.SaleList;
@Repository
public interface SaleListRepository extends JpaRepository<SaleList, Integer> {

	@Query("select s from SaleList s where (date_format(s.date,'%y-%m-%d')=date_format(current_date,'%y-%m-%d'))"
	+"and s.drink.id=?")
	List<SaleList> findByToday(@RequestParam("drinkId") int drinkId);
	
	
	
	List<SaleList> findByDrinkId(@RequestParam("drinkId") int drinkId);

}
