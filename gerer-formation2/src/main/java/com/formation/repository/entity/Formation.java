package com.formation.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "ID_FORMATEUR")
	private Formateur formateur;
	private String titre;
	private String langue;
	private String description;
	@JsonFormat(pattern = "dd-MM-2019", shape = Shape.STRING)
	private String DateDeFormation;
	private double prix;
	private String emplacement;
    private String liencv;
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(Long id, Formateur formateur, String titre, String langue, String description,
			String dateDeFormation, double prix, String emplacement,String liencv) {
		super();
		this.id = id;
		this.formateur = formateur;
		this.titre = titre;
		this.langue = langue;
		this.description = description;
		this.DateDeFormation = dateDeFormation;
		this.prix = prix;
		this.emplacement = emplacement;
		this.liencv=liencv;
	}

	public String getLiencv() {
		return liencv;
	}

	public void setLiencv(String liencv) {
		this.liencv = liencv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDeFormation() {
		return DateDeFormation;
	}

	public void setDateDeFormation(String dateDeFormation) {
		DateDeFormation = dateDeFormation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", formateur=" + formateur + ", titre=" + titre + ", langue=" + langue
				+ ", description=" + description + ", DateDeFormation=" + DateDeFormation + ", prix=" + prix
				+ ", emplacement=" + emplacement + ",liencv="+liencv+"]";
	}

}
