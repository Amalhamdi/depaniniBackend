package com.example.depaniniback.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	
	private Long id_user;
	private String nom;
	private String adresse;
	private long num;
	private String role;
	private Date date;
	private String genre;
	private String username;
	private String mdp;
	private String email;
	
	public User(Long id_user, String nom, String adresse, long num, String role, Date date, String genre,
			String username, String mdp, String email) 
	{
		super();
		this.id_user = id_user;
		this.nom = nom;
		this.adresse = adresse;
		this.num = num;
		this.role = role;
		this.date = date;
		this.genre = genre;
		this.username = username;
		this.mdp = mdp;
		this.email = email;
	}
	
	public User(Long id_user, String nom, String adresse, long num, String role, String mdp, String email) 
	{
		super();
		this.id_user = id_user;
		this.nom = nom;
		this.adresse = adresse;
		this.num = num;
		this.role = role;
		this.mdp = mdp;
		this.email = email;
	}	
}


