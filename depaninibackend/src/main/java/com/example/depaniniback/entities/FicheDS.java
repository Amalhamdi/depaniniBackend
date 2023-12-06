package com.example.depaniniback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor 
public class FicheDS {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String competences;
	private int experience;
	private Double renum;
	
	public FicheDS(String competences, int experience, Double renum) {
		super();
		this.competences = competences;
		this.experience = experience;
		this.renum = renum;
	}

}
