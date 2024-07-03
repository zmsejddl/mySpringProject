package com.mysite.myProject.Pokemon;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String type;
	
	private Integer height;
	
	private String classification;
	
	private Integer weight;
	
	private String characteristic; 
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "pokemon", cascade = CascadeType.REMOVE)
	private List<Status> statusList;
}
