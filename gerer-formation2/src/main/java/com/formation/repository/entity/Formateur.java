package com.formation.repository.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Formateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String motDePasse;
	private String identifiant;
	private String photo;
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "cv_id", referencedColumnName = "id")
	//private Cv cv;
	@OneToMany(mappedBy = "formateur", fetch = FetchType.LAZY)
	private Collection<Formation> formationList;

	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formateur(Long id, String email, String motDePasse, String identifiant, String photo, 
			Collection<Formation> formationList) {
		super();
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.identifiant = identifiant;
		this.photo = photo;
		//this.cv = cv;
		this.formationList = formationList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	public Collection<Formation> getFormationList() {
		return formationList;
	}

	public void setFormationList(Collection<Formation> formationList) {
		this.formationList = formationList;
	}

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", email=" + email + ", motDePasse=" + motDePasse + ", identifiant="
				+ identifiant + ", photo=" + photo +  ", formationList=" + formationList + "]";
	}

	
}
