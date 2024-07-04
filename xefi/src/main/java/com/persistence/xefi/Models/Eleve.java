package com.persistence.xefi.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Eleve")
public class Eleve {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(length= 50)
	private String Nom;
	
	@Column(length= 50)
	private String Prenom;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public Eleve() {
		super();
	}
}
