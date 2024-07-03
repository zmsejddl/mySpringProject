package com.mysite.myProject.PStatus;

import com.mysite.myProject.Pokemon.Pokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer HP;
	
	private Integer attack;
	
	private Integer block;
	
	private Integer contact;
	
	private Integer defense;
	
	private Integer speed;
	
	@ManyToOne
	private Pokemon pokemon;
}
