package com.cogent.dto;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Drink implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int drinkId;
	private String drinkName;
	private double cost;
	private int sugar;
	private int milk;
	private int water;
	private int tea;
	private int coffee;
	
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy="drink")
	private Set<SaleList> saleLists;

}
