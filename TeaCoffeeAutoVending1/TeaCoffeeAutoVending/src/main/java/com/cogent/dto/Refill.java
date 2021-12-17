package com.cogent.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Refill implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int refillId;
	private int teaRefill;
	private int coffeeRefill;
	private int sugarRefill;
	private int waterRefill;
	private int milkRefill;
	private Date date;
	
}
