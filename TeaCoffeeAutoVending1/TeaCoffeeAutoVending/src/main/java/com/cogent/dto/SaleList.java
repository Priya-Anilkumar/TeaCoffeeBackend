package com.cogent.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
public class SaleList {
	private static final boolean TRUE = false;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int salelistId;
	private int noofCups;
	private Date date;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=TRUE)
	@JoinColumn(name="drinkId",nullable=false)
	private Drink drink;
	

}
