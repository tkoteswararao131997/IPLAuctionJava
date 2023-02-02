package com.myapp.iplauction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="players")
@Data
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private String playerName;
	private String role;
	private int runsScored;
	private double batAvg;
	private int fifties;
	private int hundreds;
	private double strikeRate;
	private int wicketsTaken;
	private double economy;
	private double bowlAvg;
	private int fiveWickHals;
}
